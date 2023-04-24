public class Program_10 {
    public static void main(String[] args) {
        // reverse an array
        int[] arr = {1,2,4,5};
        reverse(arr, 0, 3);
        for(int val: arr){
            System.out.print(val + " ");
        }
    }

    private static void reverse(int[] arr, int i, int j) {
        if(i > j){
            return;
        }

        // processing
        swap(arr, i, j);
        reverse(arr,  i + 1, j - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}
