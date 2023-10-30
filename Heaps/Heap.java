/*
    Heap Data Structure
    -> Why Heaps?
    -> To reduce time complexity
    1. Its a complete binary tree
    2. Every node value >= All of its children
    3. Parent index (i) = i/2;
    4. left (i) = 2*i
    5. right (i) = (2*i) + 1;
    6. No pointers required
    7. Height = (log N)
    8. Insertion & Removal -> O(log N)
 */
import java.util.*;
class Heap <T extends Comparable<T>>{
    private ArrayList <T> list;
    public Heap (){
        list = new ArrayList<>();
    }
    private void Swap(int first , int sec){
        T temp = list.get(first);
        list.get(first) = list.get(sec);
        list.set(first , list.get(sec));
        list.set(sec, temp);
    }
}
