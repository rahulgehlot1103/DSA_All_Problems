import java.util.Arrays;

public class Question_15 {
    public static void main(String[] args) {
        // aggressive cow
        // return largest minimum distance
        int[] arr = { 4, 2, 1, 3, 6 };

        System.out.println(aggressiveCows(arr, 2));
    }

    private static int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 0;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int end = max;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, k, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int k, int mid) {
        int cowCount = 1;
        int lastPos = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - lastPos >= mid) {
                cowCount++;
                if (cowCount == k) {
                    return true;
                }
                lastPos = arr[i];
            }
        }
        return false;
    }
}
