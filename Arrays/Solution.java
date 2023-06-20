import java.util.*;
class Solution {
    public static int maxSatisfaction(int[] satisfaction) {
        int ans = 0;
        int n = satisfaction.length;
        // [-1 , -8 , 0 , 5, -9]
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            if(satisfaction[i]>= -1){
                res.add(satisfaction[i]);
            }
        }
        // [-1 , 0 , 5]
        Collections.sort(res);
        // [-1 , 0 , 5]
        int[] time = new int[n];
        for(int i= 0; i<n ; i++ ){
            time[i] = i+1;
        }

        for(int i = 0 ; i<n ; i++){
            ans += time[i] *  res.get(i);
        }

        return ans;

    }
    public static void main(String[] args) {
        int [] satisfaction = {-1 , -8 , 0 , 5, -9};
        int n = maxSatisfaction(satisfaction);
        System.out.println(n);
    }
}