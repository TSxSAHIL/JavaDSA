public class Sum {
    public static void main(String[] args) {
        sum(5213);
    }

    static int sum(int n){
        if(n==0){
            return 0;
        }

        return ((n%10) + sum(n/10));
    }
}
