package HashMaps;
//HashMaps Implementation
import java.util.*;
public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("Indian", 120);
        maps.put("Russian", 12000);
        maps.put("Nepali", 20);
        maps.put("African", 12450);
        maps.put("England", 124);
        System.out.println(maps);
        if(maps.containsKey("China")){
            System.out.println("Present in the Map");
        }else{
            System.out.println("Absent in the Map");
        }
        for(Map.Entry<String, Integer> e: maps.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
            
        }
        
    }
}
