import java.util.*;
public class AlternateSort{
    public static void main (String[] args) {
        int n = 5;
        int[] arr = {5,1,4,7,9};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<n ;i++){
            if(i%2==0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        System.out.print("The Output is: ");
        for(int i = 0 ; i<list.size() ; i++){
            System.out.print(list.get(i) + " ");
        }
    }
}





















