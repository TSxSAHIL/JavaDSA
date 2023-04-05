import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        int nums[] = {1,3,5,2,1,2,1,0,3,1,1,1,1,1,1};
        majorityElement(nums);
    }

    public static void majorityElement(int nums[]){
        HashMap<Integer , Integer>  maps = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i<nums.length ; i++){
            if(maps.containsKey(nums[i])){
                maps.put(nums[i] , maps.get(nums[i])+1);
            }else{
                maps.put(nums[i] , 1);
            }
        }
        for(int key : maps.keySet()){
            if(maps.get(key)>n/3){
                System.out.println(key);
            }
        }
    }


}
