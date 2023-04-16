public class Program_13 {
    public static void main(String[] args) {
        // sort 0 1
        int[] arr = { 1, 1, 0, 2, 2, 0, 0, 2, 2, 0, 1, 0 };
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        sort012(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void sort012(int[] arr) {
        int lo = 0, mid = 0, hi = arr.length - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr, lo, mid);
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } 
            else {
                swap(arr, mid, hi);
                hi--;
            }
        }
    }

    private static void sort01(int[] arr) {
        // method 1
        // int countZero = 0;
        // int countOne = 0;
        // int i = 0;
        // while (i < arr.length) {
        // if (arr[i] == 0)
        // countZero++;
        // else
        // countOne++;
        // i++;
        // }

        // i = 0;
        // while (i < countZero) {
        // arr[i] = 0;
        // i++;
        // }
        // while (i < countZero + countOne) {
        // arr[i] = 1;
        // i++;
        // }

        // method 2
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            if (arr[lo] == 0)
                lo++;
            else if (arr[hi] == 1)
                hi--;

            // arr[lo] == 1 && arr[j] == 0
            else {
                swap(arr, lo, hi);
                lo++;
                hi--;
            }
        }

    }

    private static void swap(int[] arr, int lo, int hi) {
        int swap = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = swap;
    }
}
