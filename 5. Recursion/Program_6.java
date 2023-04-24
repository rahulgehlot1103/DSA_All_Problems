public class Program_6 {
    public static void main(String[] args) {
        // check isSorted using recursion
        int[] arr = { 1, 2, 3, 4, 5, 6, 67, 7, 8, 9 };
        boolean ans = isSorted(arr, arr.length);
        System.out.println(ans);
    }

    private static boolean isSorted(int[] arr, int n) {
        // base case
        if (n == 0 || n == 1) {
            return true;
        }
        // array is not in sorted order
        if (arr[n - 2] > arr[n - 1])
            return false;
        else {
            return isSorted(arr, n - 1);
        }
    }
}
