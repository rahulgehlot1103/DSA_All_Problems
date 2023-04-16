public class Question_6 {

    public static void main(String[] args) {
        // peak index in a mountain array
        // return the largest element in an array
        int[] arr = { 0, 1, 2, 1, 0 };
        System.out.println(peakIndex(arr));
    }

    public static int peakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            // we are in the increasing of the array
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            // we are in the decreasing order of the array
            else // mid > mid + 1
                // this could be the ans, but look at left
                // this is why end is not mid - 1
                end = mid;
        }

        // we can return both start or end coz both will point at the max element
        return start;
    }
}