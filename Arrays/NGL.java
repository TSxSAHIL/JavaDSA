import java.util.*;

public class NGL{
    public static void main (String[] args) {
        int[] arr = {1,3,2,4};
        ArrayList<Integer> result = NGR(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> NGR(int[] arr){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> rl = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length-1;
        for(int i=0; i<=n; i++){
            if(st.empty()){
                rl.add(-1);
            }
            else if(st.peek() > arr[i] && st.size() > 0){
                rl.add(st.peek());
            }
            else if(st.size() > 0 && st.peek() <= arr[i]){
                while(!st.empty() && st.peek() <= arr[i]){
                    st.pop();
                }
                if(st.size() == 0){
                    rl.add(-1);
                }
                else{
                    rl.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        reverse(rl, ans);
        return ans;
    }

    public static void reverse(ArrayList<Integer> rl, ArrayList<Integer> ans){
        for(int i=0; i < rl.size(); i++){
            ans.add(rl.get(i));
        }
    }
}
