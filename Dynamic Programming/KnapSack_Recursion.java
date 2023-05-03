import java.util.*;

public class KnapSack_Recursion {
    public static int KnapSack(int wt[], int val[] , int W , int n){
        if(n==0 || W==0){
            return 0;
        }
        if(wt[n-1] > W){
            return Math.max(val[n-1] + KnapSack(wt, val, W-wt[n-1], n), KnapSack(wt, val, W, n-1));
        }
        else if(wt[n-1 ]>0){
            return KnapSack(wt, val, W, n-1);
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 4;
        int wt[] = {1,3,4,2};
        int val[] = {1,4,7,5};
        int W = 7;
        int maxProfit = KnapSack(wt, val, W, n);
        System.out.println(maxProfit);
    }
}
