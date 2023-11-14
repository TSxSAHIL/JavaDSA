import java.util.*;
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;
        for(int i = 0 ; i<piles.length; i++){
            maxHeap.offer(piles[i]);
        }
        
        while(k>0){
            int remWalaElement = maxHeap.poll();
            remWalaElement -= Math.floor(remWalaElement/2);
            maxHeap.offer(remWalaElement);
            k--;
        }
        for(int i = 0 ; i<maxHeap.size();i++){
            ans += maxHeap.poll();
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int[] piles = {5,4,9};
        int k = 2;
        Solution s = new Solution();
        System.out.println(s.minStoneSum(piles, k));
    }

}