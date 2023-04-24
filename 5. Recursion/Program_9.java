public class Program_9 {
    public static void main(String[] args) {
        // binary search
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int ans = binarySearch(arr, 0, n - 1, 71);
        if(ans != -1){
            System.out.println("Element is present at index: " + ans);
        }
        else{
            System.out.println("Element not present");
        }

    }
    private static int binarySearch(int[] arr, int start, int end, int key) {
        int mid = start + (end - start) / 2;
        // element not found
        if(start > end){
            return -1;
        }
        // element found
        if(arr[mid] == key){
            return mid;
        }
        if (arr[mid] > key) {
            return binarySearch(arr, start, mid - 1, key);
        } else
            return binarySearch(arr, mid + 1, end, key);
    }
}
