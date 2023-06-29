import java.util.*;
class Solution {  
    public static void main(String[] args) {  
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i <n ; i++){
            arr[i] = sc.nextInt();
        } 
        int result=-1;  
        int left_sum=0;  
        int right_sum=0;  
        for(int i=0;i<n;i++){  
            right_sum+=arr[i];  
        }  
        for(int i=0;i<n;i++){  
            right_sum-=arr[i];  
            if(left_sum==right_sum)  
            result=i;  
            left_sum+=arr[i];  
        }  
        System.out.println("The result is at index : " + result);  
    }  
}  