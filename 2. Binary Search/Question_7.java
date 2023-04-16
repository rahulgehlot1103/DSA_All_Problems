public class Question_7 {
    public static void main(String[] args) {
        // find in mountain array
        int [] arr  = {1, 2, 4, 5, 3, 1};
        System.out.println(search(arr, 3));

    }

    static int search(int[]  arr, int target){
        int peak = peakIndex(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry != 1){
            return firstTry;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndex(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            // we are in the increasing of the array
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            // we are in the decreasing order of the array
            else
            // this may be the ans, but look at left
            // this is why end is not mid - 1
                end = mid;
        }

        // we can return both start or end coz both will point at the max element
        return start;
    }

    static int binarySearch(int arr[], int target, int start, int end)
    {
     
        // Checking the sorted order of the given array
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;
     
            // Check if x is present at mid
            if (arr[middle] == target)
                return middle;
     
            // Ascending order
            if (isAsc) {
     
                // If x greater, ignore left half
                if (arr[middle] < target)
                    start = middle + 1;
     
                // If x smaller, ignore right half
                else
                    end = middle - 1;
            }
     
            // Descending order
            else {
     
                // If x greater, ignore right half
                if (arr[middle] < target)
                    end = middle - 1;
     
                // If x smaller, ignore left half
                else
                    start = middle + 1;
            }
        }
     
        // Element is not present
        return -1;
    }
}
