import java.util.Arrays;

public class arr5 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0] =99;
    }
    
}
