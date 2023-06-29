import java.util.*;
public class Queue {
    public static void main(String[] args) {
        int[] array = {20,5,6,15,4,2};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i<array.length; i++){
            arr.add(array[i]);
        }
        int total_time = 0;
        for(int i = 0 ; i<arr.size() ; i++){
            if(arr.get(i)>=5){
                total_time += 7;
                arr.add(arr.get(i)-6);
            }
            else if(arr.get(i)<5){
                total_time += 2;
            }
        }
        System.out.println(arr);
        System.out.println("The Total Time is: " +total_time);
    }    
}
