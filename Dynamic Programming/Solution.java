import java.util.*;
//Rank 180 in Geeks For Geeks
//180 -> 90
public class Solution{
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        for(int i = 0 ; i<n ; i++){
            if(nums[i]<0){
                a1.add(nums[i]);
            }
            else{
                a2.add(nums[i]);
            }
        }
        for(int i = 0 ; i<a1.size() ; i++){
            if(i%2==0 ){
                ans[i] = a2.get(i);
            }
        }

        for(int i = a1.size() ; i<a1.size() + a2.size(); i++){
            ans[i] = a2.get(i - a1.size());
        }

        return ans;

    }

    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        int arr[] = rearrangeArray(nums);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
