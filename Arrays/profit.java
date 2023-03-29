public class profit {
    private static int profits;

    public static void main(String[] args) {
        int [] nums = {7,1,5,6,3,4};
        pro(nums);

    }

    static int pro(int[] nums){
        for(int i = 0 ; i<nums.length ; i++){
            for(int j  = i+1 ; j<nums.length; j++){
                int profits = nums[j] - nums[i];
                
            }
        }
        return profits;
    }
}
