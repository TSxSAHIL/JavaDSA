/*
    HashMaps Data Structure
    We use hashmaps becuase of constant time complexity.
    1. We need all elements ad positive numbers -> Hashcode function
    2. Hashcode can be very large so reduce it, it is called hashing
    
    ** Two ways to avoid collions
    1. Chaining 
    2. Open Addressing

    HashFunctions 
    1. Division Method -> h(k) = k%m;
    2. Multiplication Methid

    Universal Hashing ->  h(k) = [(ak+b)%p]%m 
    Using this the prob that P[h(k1) = h(k2)] = 1/m

    Size of table -> m = theta(n)
    Idea -> Start small then grow

*/
import java.util.*;
class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Kunal" , 99);
        map.put("Karan" , 0);
        System.out.println(map.get("Karan"));
        System.out.println(map.containsKey("Kunal"));
    }
}
