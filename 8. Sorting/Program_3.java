public class Program_3 {
    public static void main(String[] args) {
        // Insertion Sort
        int[] arr = {13, 46, 52, 24, 20, 9};

        InsertionSort(arr);
        for(int val: arr)
            System.out.print(val + " ");
    }

    private static void InsertionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
