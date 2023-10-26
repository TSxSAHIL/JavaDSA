public class Numbers {
    void sum(int a ,  int b){
        System.out.println(a+b);
    }

    void sum(int a , int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 4;
        
        Numbers n = new Numbers();
        n.sum(a, b, c);
        n.sum(a, b);
    }
}
