public class Program_5 {
    public static void main(String[] args) {
        // Search in 2D matrix
        // using binary search
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 } };

        boolean ans = searchMatrix(arr, arr.length, arr[0].length, 1232);
        System.out.println(ans);
    }

    private static boolean searchMatrix(int[][] arr, int r, int c, int target) {
        int start = 0;
        int end = c - 1;
        while (start < r && end >= 0) {
            if (arr[start][end] == target) {
                return true;
            } else if (arr[start][end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}
