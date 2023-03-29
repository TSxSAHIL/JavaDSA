public class binarysearch2 {
    //order agnostic binary search
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1,0};
        int search = OrderAgnostic(arr, 5);
        System.out.println(search);
    }
    static int OrderAgnostic(int[] arr , int target){
        int start = 0;
        int end  = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        


        while(start <= end){
            // find middle element
            // int mid  = (start + end) /2  (Might be possible that (start + end) exceeds the range of int in java )}
            int mid = start + (end-start) /2 ;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
