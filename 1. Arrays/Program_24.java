public class Program_24 {
    public static void main(String[] args) {
        // left rotate array by one place
        int[] arr = { 1, 2, 3, 4, 5 };
        leftRotate(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    private static void leftRotate(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }
}
