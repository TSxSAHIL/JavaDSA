import java.util.Scanner;
public class Function1 {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num 1");
        int num1 = in.nextInt();
        System.out.print("Enter num 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = "+ sum);
    }
}
