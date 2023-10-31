import java.util.*;

import javax.swing.text.html.parser.Entity;

class Hash {
    private Entity[] entities;

    public Hash(){
        entities = new Entity[100];
    }

    public void put(String key , String value){
        int hash = Math.abs(key.hashCode()%entities.length);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key , String value){
            this.key = key;
            this.value = value;
        }
    }
}
