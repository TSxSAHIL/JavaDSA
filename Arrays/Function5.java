public class Function5 {
    public static void main(String[] args) {
        String p = myGreet("Sahil");
        System.out.println(p);

    }
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
    
}
