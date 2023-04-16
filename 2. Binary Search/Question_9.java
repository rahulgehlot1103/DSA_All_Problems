public class Question_9 {
    public static void main(String[] args) {
        // count all occurrence of the target

        int[] arr = { 2, 2, 3, 4, 4, 4, 4, 5, 6, 6, 7 };
        // first occurrence
        int first = elementOccurrence(arr, 12, true);
        // last occurrence
        int last = elementOccurrence(arr, 12, false);
        if (first == -1 || last == -1)
            System.out.println(0);
        else
            System.out.println((last - first + 1));
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
                if (isFirst) {
                    ans = mid;
                    end = mid - 1;
                } else {
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
