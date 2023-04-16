
public class Question_1 {
    public static void main(String[] args) {
        // code for binary search
        // array must be sorted (increasing or decreasing order)
        int[] arr = { 2, 4, 6, 8, 10, 11, 23, 78, 89 };
        int[] arr2 = { 9, 8, 7, 5, 4, 3, 2, 1 };
        System.out.println(binarySearch(arr, -1));
        System.out.println(binarySearch(arr2, 2));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            // int mid = (start + end) / 2;
            // might be possible that (start + end) exceeds range of int so,
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // if array is sorted in ascending order
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // if array is sort in decreasing order
            else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}