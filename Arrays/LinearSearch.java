public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,6,7};
        printArray(arr,7);
        reversearray(arr, 0, 6);
        System.out.println("The reversed array is:");
        printArray(arr, 7);
    }

    static void reversearray(int[] arr , int s , int e){
        // 0 1 2 3 4 5 6 7 
        int temp;
        while(s<e){
            temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;

        }
    }

    static void printArray(int[] arr, int size){
        for(int i=0 ; i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}