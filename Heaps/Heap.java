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
        list.set(first , list.get(sec));
        list.set(sec, temp);
    }

    private int parent (int index){
        return (index-1)/2;
    }
    private int left(int index){
        return (2*index)+1;
    }
    private int right(int index){
        return (2*index)+2;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p))<0){
            Swap(index,p);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap");
        }
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }
    
    private void downheap (int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left<list.size()&&list.get(min).compareTo(list.get(left))>0){
            min = left;
        }
        if(right<list.size()&&list.get(min).compareTo(list.get(right))>0){
            min = right;
        }
        if(min != index){
            Swap(min, index);
            downheap(min);
        } 
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

    public static void main(String[] args) throws Exception{
        int arr[] = {4,1,3,2,16,9,10,14,9,7};
        Heap<Integer> heap = new Heap<>();

        for(int i = 0 ; i<arr.length ; i++){
            heap.insert(arr[i]);
        }
        System.out.println(heap.remove());
        ArrayList list = heap.heapSort();
        System.out.println(list);

    }
}
