import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        // Time Complexity -> O(n)
        // Space Complexity -> O(n)
        int [] nums = {1,3,4,2,33};
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int n = nums.length;
        int m = set.size();
        if(n==m){
            System.out.println("No Duplicates found in the array");
        }
        else{
            System.out.println("Duplicates found in the array");
        }
    }
}
