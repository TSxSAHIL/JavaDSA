import java.util.*;

class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int k = 0;
        for (String word : words) {
            if (word.equals("prev")) {
                if (k >= nums.size()) {
                    result.add(-1);
                } else {
                    int lastVisited = nums.get(nums.size() - k - 1);
                    result.add(lastVisited);
                }
                k++;
            } else {
                int num = Integer.parseInt(word);
                nums.add(num);
                result.add(num);
                k = 0;
            }
        }
        return result;
    }
}


