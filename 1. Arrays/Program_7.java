public class Program_7 {
    public static void main(String[] args) {
        // swap alternate
        int[] arr = {1, 2, 3, 4, 5};

        print(arr);
        swapAlternate(arr);
        print(arr);
    }

    private static void swapAlternate(int[] arr) {
        for(int i = 1; i < arr.length; i = i + 2){
            swap(arr, i, i - 1);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    private static void print(int[] arr) {
        for(int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
