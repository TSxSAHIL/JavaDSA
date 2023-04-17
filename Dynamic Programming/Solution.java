import java.util.*;
public class Solution
{
    public static int maxLength(int arr[] , int n , int k){
        int maxlength = 0 ;
        for (int i = 0; i < n; i++) {
            int sum = 0 ;
            for(int j=0 ; j<n ; j++){
                sum = sum + arr[j];
                if(sum==k){
                    maxlength = Math.max(maxlength, (j-i+1));
                }
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int n = 6;
        int k = 15;
        int arr[] = {10,5,2,7,1,9};
        maxLength(arr, n, k);
        System.out.println(maxLength(arr, n, k));
    }
}

