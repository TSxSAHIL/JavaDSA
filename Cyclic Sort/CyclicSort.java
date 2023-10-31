/*
    Cyclic Sort 
    ->    If we have given 1 -> n Order Array
    ->    The array must be jumbled
    ->    index = value - 1;
    ->    Worst Time Complexity -> O(2N-1) or O(N)
    
 */

class CyclicSort {
    public static void main(String[] args) {
        int arr [] = {3,5,2,1,4};
        cyclicSort(arr);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    public static void cyclicSort(int arr[]){
        int i = 0 ;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int arr[] , int i , int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
