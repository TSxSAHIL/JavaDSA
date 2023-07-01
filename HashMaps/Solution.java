class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int [] a = NGR(arr);
        int [] b = NGL(arr);
        int[] ans = new int[arr.length];
        for(int i = 0 ; i<arr.length; i++){
            ans[i] = Math.max(a[i] , b[i]);
        }
        return ans;
    }

    public static int[] NGR(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i = n-1 ; i>=0 ; i--){
            if(st.size()==0){
                res[i] = -1;
            }
            else if(st.size()>0 && st.peek()>arr[i]){
                res[i] = st.peek();
            }
            else if(st.size()>0 && st.peek()<=arr[i]){
                while(st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    res[i] = 0;
                }
                else{
                    res[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        Collections.reverse(Arrays.asList(res));
    }

    public static int[] NGL(int[] arr){
        Stack<Integer>  st = new Stack<>();
        int m = arr.length;
        int[] res2 = new int[m];
        for(int i = 0 ; i<n ; i++){
            if(st.size()==0){
                res2[i] = -1;
            }
            else if(st.size()>0 && st.peek()>arr[i]){
                res2[i] = st.peek();
            }
            else if(st.size()>0 && st.peek()<=arr[i]){
                while(st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.size()==0){
                    res2[i] = -1;
                }
                else{
                    res2[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        return res2
    }
}