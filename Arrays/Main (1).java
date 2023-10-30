import java.util.*;
public class Main{
    public static void main (String[] args) {
        int[] [] arr = {{1,0,1} , {1,1,1} , {0,0,1}};
        int count[] = new int[3];
        int counter = 0;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                if(arr[i][j] == 1){
                    counter++;
                }
            }
            count[i] = counter;
            counter = 0;
        }
        int max = 0;
        for(int i = 0 ; i<count.length ;i++){
            if(count[i]>max){
                max = i;
            }
        }
        System.out.print(max+1);
    }
}