import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        int[] ans = new int[nums.length];
        Arrays.sort(ans);
        for(int i = 0 ; i<ans.length; i++){
            if(ans[i]==ans[i+1]){
                System.out.println(ans[i]);
            }
            
        }
        System.out.println("0");
    }
}
