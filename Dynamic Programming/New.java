// Queue using two stacks

public class New{
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 2, 1};
        int n = arr.length;
        System.out.println(FrogJumps(arr, n));
    }

    public static int FrogJumps(int[] arr, int n){
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i = 1; i < n; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 0; j < i; j++){
                if(arr[j] + j >= i){
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[n-1];
    }
}