import java.util.Arrays;
import java.util.Scanner;

public class arr6 {
    //2d arrays
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][];
        //Second Methord
        // int[][] arr1 = {
        //         {1,2,3},
        //         {4,5,},
        //         {6,7,8,9}
        // };
        //INPUT OF 2D ARRAY
        for (int i = 0; i < arr.length; i++) {
            //for each column in every row
            for (int column = 0; column < arr[i].length; column++) {
                arr[i][column] = in.nextInt();
            }   
        }
        System.out.println("The entered 2d array is : ");
        //OUTPUT OF 2D ARRAY
        // for (int i = 0; i < arr.length; i++) {
        //     //for each column in every row
        //     for (int column = 0; column < arr[i].length; column++) {
        //         System.out.print(arr[i][column] + " ");
        //     }   
            System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}