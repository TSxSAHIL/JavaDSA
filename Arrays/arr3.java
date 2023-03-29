import java.util.Arrays;
import java.util.Scanner;

public class arr3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = input.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}
