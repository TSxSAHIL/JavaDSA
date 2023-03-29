public class ngi {
    public static void main(String[] args) {
        int n = 21;
        int ans = 0 ;
        while(n!=0){
            int rem = n % 10;
            ans = ans * 10 +  rem;
            n = n / 10;
        }

        if(ans > n){
            System.out.println(ans);
        }
        else{
            System.out.println("-1");
        }
    }
}
