public class Question_11 {
    public static void main(String[] args) { 
        int[] arr = {1,2,4,5,3,1};
        // findMinInBitonicArray(arr);
        // findPeak(arr);
        int ans = searchInABitonicArray(arr, 3);
        System.err.println(ans);
    }

    // find min in a bitonic array
    static void findMinInBitonicArray(int[] arr){
        if(arr.length == 0)
            System.out.println("array is empty");
        else if(arr.length == 1)
            System.out.println("Min element is: " + arr[0]);
        else
            System.out.println(Math.min(arr[0], arr[arr.length - 1]));
    }

    // peak in a bitonic array
    static int findPeak(int[] arr){
        int lo = 0, hi = arr.length - 1;
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            // we're in the increasing order
            if(arr[mid] < arr[mid + 1]){
                lo = mid + 1;
            }
            // we're in the decreasing order arr[mid] > arr[mid + 1]
            else{
                hi = mid;
            }
        }
        // System.out.println("peak element is: " + arr[lo]);
        return lo;
    }
     

    // search in a bitonic array
    static int searchInABitonicArray(int[] arr, int target){
        int peak = findPeak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry != -1)
            return firstTry;
        
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int binarySearch(int arr[], int target, int start, int end) {
        // Checking the sorted order of the given array
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;
     
            // Check if x is present at mid
            if (arr[middle] == target)
                return middle;
     
            // Ascending order of array
            if (isAsc) {
     
                // If x greater, ignore left half
                if (arr[middle] < target)
                    start = middle + 1;
     
                // If x smaller, ignore right half
                else
                    end = middle - 1;
            }
     
            // Descending order of array
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
