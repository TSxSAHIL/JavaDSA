import java.util.Arrays;
import java.util.Scanner;
public class arr10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of Array: ");
        int[] arr =new int[5];
        for(int i = 0 ;i<5 ; i++){
            arr[i] = in.nextInt();
        }
        Swap(arr, 1, 3);
        System.out.print("The swapped Array is :");
        System.out.println(Arrays.toString(arr));
    }

    static void Swap(int[]arr ,int  i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
