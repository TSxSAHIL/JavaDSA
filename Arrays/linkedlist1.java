import java.util.*;

public class linkedlist1{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Sahil ");
        list.add("Arora ");
        list.add("is ");
        list.add("a good boy");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
