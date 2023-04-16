public class Program_14 {
    public static void main(String[] args) {
        // find the pivot element in an array
        // left sum == right sum
        int[] arr = { 1, 7, 3, 6, 5, 6 };

        int ans = findPivot(arr);
        System.out.println(ans);
    }

    private static int findPivot(int[] arr) {
        int leftSum = 0;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i;
            } else {
                leftSum += arr[i];
            }
        }
        return 0;
    }
}
