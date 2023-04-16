public class Question_5 {
    public static void main(String[] args) {
        // find position of an element in a sorted array of infinite nos.
        // int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int arr1[] = {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1};
        // int target = 10;

        // System.out.println(findingRange(arr, target));
        System.out.println(findingRange(arr1, 2));
    }

    static int findingRange(int[] arr, int target){
        // first find the range
        // first start with a box of size 2
        int lo = 0;
        int hi = 1;
        // condition for the target to lie in the range
        while(target > arr[hi]){
            int newLo = hi + 1; //this is my new start
            // double the range
            // end = prev end + sizeOfbox * 2
            hi = hi + (hi - lo + 1) * 2; //updating the end
            lo = newLo;
        }
        // return binarySearch(arr, target, lo, hi);
        return firstOccurrence(arr, target, lo, hi);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        
        while(start <= end){
            // might be possible that (start + end) exceeds range of int
            // int mid = (start + end) / 2;

            int mid = start + (end - start) / 2; 
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else 
            // ans found
                return mid;
        }
        return -1;
    }

    static int firstOccurrence(int[] arr, int target, int lo, int hi){
        int first = -1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == target){
                first = mid;
                hi = mid - 1;
            }else if(arr[mid] < target){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return first;
    }
}

