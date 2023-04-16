public class Question_14 {
    public static void main(String[] args) {
        // painter partition problem
        // it is same as book allocation problem
        int[] arr = { 10, 20, 30, 40 };

        System.out.println(findLargestMinDistance(arr, 2));
    }

    private static int findLargestMinDistance(int[] arr, int m) {
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
        int painterCount = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] <= mid) {
                sum += arr[i];
            } else {
                painterCount++;
                if (painterCount > m || arr[i] > mid) {
                    return false;
                }
                sum = arr[i];
            }
        }
        return true;
    }
}
