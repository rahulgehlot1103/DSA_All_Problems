public class Question_13 {
    public static void main(String[] args) {
        // book allocation problem
        int[] arr = { 10, 20, 30, 40 };

        System.out.println(allocateBooks(arr, 2));
    }

    private static int allocateBooks(int[] arr, int m) {
        int n = arr.length;
        int sum = 0;

        for (int val : arr) {
            sum += val;
        }

        int start = 0;
        int end = sum;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossibleSol(arr, n, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossibleSol(int[] arr, int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                studentCount++;
                if (studentCount > m || arr[i] > mid) {
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }
}