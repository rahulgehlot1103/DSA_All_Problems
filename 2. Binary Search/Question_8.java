public class Question_8 {
    public static void main(String[] args) {
        // find pivot in a rotated sorted array(minimum element)
        // search in a rotated sorted array
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        System.out.println(findPivot(arr));
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // if pivot found
        if (arr[pivot] == target)
            return pivot;
        else if (target >= arr[0])  //search in 1st half
            return binarySearch(arr, target, 0, pivot - 1);
        else    //search in 2nd half
            return binarySearch(arr, target, pivot, arr.length - 1);
    }

    static int findPivot(int[] arr) {

        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= arr[0]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return hi;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // might be possible that (start + end) exceeds range of int
            // int mid = (start + end) / 2;

            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else
                // ans found
                return mid;
        }
        return -1;
    }
}