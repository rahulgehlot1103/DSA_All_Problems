public class Program_2 {
    public static void main(String[] args) {
        // Bubble sort
        int[] arr = {13, 46, 52, 24, 20, 9};
        int[] arr1 = {1,2,3,4,5,6};
        bubbleSort(arr);
        for(int val: arr1)
            System.out.print(val + " ");
    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            boolean isSorted = true;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j , j + 1);
                    isSorted = false;
                }
            }
            if(isSorted)
                break;
            System.out.println("runs ");
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i]= temp;
    }
}
