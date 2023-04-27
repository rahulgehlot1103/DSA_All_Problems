

public class Program_4 {

    public static void main(String[] args) {
        // Merge Sort
        int[] arr = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length - 1);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        // base case
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        // 1st half
        mergeSort(arr, start, mid);
        // 2nd half
        mergeSort(arr, mid + 1, end);

        // MERGE TWO ARRAYS
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
       int[] n1 = new int[mid - start + 1];
       int [] n2 = new int[end - mid];

       for(int i = 0; i < n1.length; i++){
            n1[i] = arr[i + start];
       }
       for(int j = 0; j < n2.length; j++){
            n2[j] = arr[j + mid + 1];
       }
       
       int i = 0, j = 0, k = start;
        while (i < n1.length && j < n2.length) {
            if (n1[i] <= n2[j]) {
                arr[k] = n1[i];
                i++;
                k++;
            } else {
                arr[k] = n2[j];
                j++;
                k++;
            }

        }
            // if elements are remaining in any of the array
            while (i < n1.length) {
                arr[k] = n1[i];
                i++;
                k++;
            }

            while (j < n2.length) {
                arr[k] = n2[j];
                j++;
                k++;
            }
        }
}
