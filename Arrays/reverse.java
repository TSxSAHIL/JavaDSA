public class reverse {
    public static void main(String[] args) {
        System.out.println(rev(4576));
        
    }

    static int sum =0;

    static void rev(int n){
        
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        rev(n/10);


    }
}
