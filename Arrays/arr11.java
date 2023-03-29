public class arr11 {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 15, 2021521020, 25 };
        int max = 0;
        Maximum(arr, max);
        System.out.println(Maximum(arr, max););
    }

    static void Maximum(int[] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    }
}
