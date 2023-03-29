import java.util.Arrays;

public class Function11 {//varargs
    public static void main(String[] args) {
        fun(2,3,4,5,6);
        fun1(44, 45, "Sahil" , "Jony" , "Simran" , "Alok");

    }
    static void fun1(int a , int b, String...v){}
    static void fun(int ...v){
        // System.out.println(Arrays.toString(v));
    }
}
