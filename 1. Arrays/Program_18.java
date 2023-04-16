public class Program_18 {
    public static void main(String[] args) {
        // check if sorted and rotated array
        int[] arr = { 3, 4, 5, 1, 2 };
        boolean check = isSortedAndRotated(arr);
        System.out.println(check);
    }

    private static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length - 1;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i])
                count++;
        }
        if (arr[n - 1] > arr[0])
            count++;

        if (count <= 1)
            return true;

        return false;
    }
}
