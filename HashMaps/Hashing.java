package HashMaps;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        int nums1[] = {7, 3, 9};
        int nums2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> result = majorityElement(nums1, nums2);
        System.out.println(result);
    }

    public static HashSet<Integer> majorityElement(int num1[], int num2[]) {
        int n1 = num1.length;
        int n2 = num2.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            arr.add(num1[i]);
        }
        for (int i = 0; i < n2; i++) {
            arr.add(num2[i]);
        }

        HashSet<Integer> ans = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            ans.add(arr.get(i));
        }

        return ans;
    }
}
