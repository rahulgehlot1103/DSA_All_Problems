public class Program_1 {
    public static void main(String[] args) {
        // Selection sort
        int[] arr = {13, 46, 52, 24, 20, 9};

        selectionSort(arr);
        for(int val: arr)
            System.out.print(val + " ");
    }

    private static void selectionSort(int[] arr) {
        for(int i = 0; i <= arr.length - 2; i++){
            int mini = i;
            for(int j = i ; j < arr.length; j++){
                if(arr[j] < arr[mini])
                    mini = j;
            }
            swap(arr, mini, i);
        }
    }

    private static void swap(int[] arr, int mini, int i) {
        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }
}