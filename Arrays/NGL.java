import java.util.*;

public class NGL {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4 };
        ArrayList<Integer> result = NGR(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> NGR(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (st.size() == 0) {
                ans.add(-1);
            } else if (st.peek() > arr[i] && st.size() > 0) {
                ans.add(st.peek());
            } else if (st.peek() <= arr[i] && st.size() > 0) {
                while (st.peek() <= arr[i] && !st.empty()) {
                    st.pop();
                }
                if (st.size() == 0) {
                    ans.add(-1);
                } else {
                    ans.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;

    }
}