public class palindrome {
    public static void main(String[] args) {
        int n = 602040;
        count()
        

    }
        
    static int count(int n){
        return helper;
    }
    private static int helper(int n , int c){
        if(n==0){
            return c;
        }

        int rem = n%10;
        if(rem==0){
            return helper(n/10 , c+1)
        }
        return helper(n/10,c);
    }
}
