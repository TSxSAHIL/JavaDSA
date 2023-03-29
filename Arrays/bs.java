public class bs {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7,10,12,15,16,18,19,22,25,226};
        int target = 22;
        int search = bin(arr,target);
        System.out.println(search);
    }

    static int bin(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start) /2;
            if(target>arr[mid]){
                start = mid + 1;
            }
            else if (target<arr[mid]){
                end  = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}