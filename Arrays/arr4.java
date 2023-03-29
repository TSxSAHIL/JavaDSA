import java.util.Arrays;
import java.util.Scanner;

public class arr4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str =new String[4];
        for(int i =0 ; i<str.length; i++){
            str[i] = in.next();
        } 
        System.out.println(Arrays.toString(str));
        str[0] = "Sahil";
        System.out.println(Arrays.toString(str));
    }
}
