import java.util.*;
public class Trie {

    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i = 0 ; i<26 ; i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) { //O(n)
        int level = 0;
        int len = word.length();
        int idx = 0;
 
 
        Node curr = root;
        for(; level<len; level++) {
            idx = word.charAt(level)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i=0 ; i<key.length() ; i++){
            int index = key.charAt(i) - 'a';
            if(curr.children[index]==null){
                return false;
            }
            if(i==key.length()-1 && curr.children[index].eow == false  ){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }
 

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for (String word : words) {
            insert(word);
            System.out.println("inserted " + word);
        }
        String key = "the" ;
        System.out.println(search(key));
 
    }
}