// import java.util.Arrays;
// import java.util.Scanner;
public class Array1{
    public static void main(String[] args) {
        int[] nums = {4,1,3,3};
        int bad = 0;
        for(int i =0 ; i<nums.length; i++){
            for(int j= i+1 ; j<nums.length ; j++){
                if(i<j && j-i != nums[j]-nums[i]){
                    bad++;
                }
                // else{
                //     bad = bad + 0;
                // }
            }
        }
        System.out.println(bad);
    }
}