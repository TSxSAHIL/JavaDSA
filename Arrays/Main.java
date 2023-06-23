import java.util.*;

public class Main{
    public static void main (String[] args) {
        int[] arr = {4, 5, 2, 25};
        ArrayList<Integer> result = NGR(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> NGR(int[] arr){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> rl = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length-1;
        for(int i=n; i>=0; i--){
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
        for(int i=rl.size()-1; i >= 0; i--){
            ans.add(rl.get(i));
        }
    }
}
