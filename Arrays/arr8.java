import java.util.ArrayList;
import java.util.Scanner;
public class arr8 {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(54);
        // list.add(45);
        // list.add(67);
        // list.add(54);
        // list.add(45);
        // list.add(67);
        // list.add(54);
        // list.add(45);
        // list.add(67);
        // list.add(54);
        // list.add(45);
        // System.out.println(list.contains(54));
        // System.out.println(list.set(0,1));
        // System.out.println(list );
        Scanner in = new Scanner(System.in);
        
        for(int i = 0 ;i<5 ; i++){
            list.add(in.nextInt());
        }
        System.out.println(list);
    }
}
