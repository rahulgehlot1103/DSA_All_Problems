public class Question_4 {
    public static void main(String[] args) {
        // first and last occurrence of the element
        int[] arr = { 2, 2, 3, 4, 4, 4, 4, 5, 6, 6, 7 };

        int[] ans = new int[2];
        // first occurrence
        int first = elementOccurrence(arr, 4, true);
        // last occurrence
        int last = elementOccurrence(arr, 4, false);
        ans[0] = first;
        ans[1] = last;
        System.out.println("first occurrence is:" + ans[0]);
        System.out.println("last occurrence is:" + ans[1]);

        int totalNoOfOccurrence = (last - first + 1);
        System.out.println("total No Of Occurrence of 4 is: " + totalNoOfOccurrence);
    }

    public static int elementOccurrence(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            // might be possible that (start + end) exceeds range of int
            // int mid = (start + end) / 2;

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                // searching for the first occurrence //leftmost occurrence
                if (isFirst) {
                    ans = mid;
                    end = mid - 1;
                }
                // searching for the last occurrence //rightmost occurrence
                else {
                    ans = mid;
                    start = mid + 1;
                }
            } else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }
}