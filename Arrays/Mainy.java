import java.util.Arrays;

public class Mainy {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        // System.out.println(s1);
        String s2 = new String(s1);
        // System.out.println(s2);

        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        // System.out.println(t1);
        String t2 = new String(t1);
        System.out.println(t2);

        if(s2.equals(t2)){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
