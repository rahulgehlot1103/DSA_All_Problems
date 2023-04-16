public class Program_17 {
    public static void main(String[] args) {
        // rotate array
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int r = 3;
        print(arr);
        rotate(arr, r);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void rotate(int[] arr, int r) {
        // part 1
        reverse(arr, 0, r - 1);
        // part 2
        reverse(arr, r, arr.length - 1);
        // part 1 + 2
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            i++;
            j--;
        }
    }
}
