public class Question_2 {
    public static void main(String[] args) {
        // ceiling of a number
        int[] arr = {2, 4, 5, 6, 9, 12, 18, 23, 56, 76, 123};
        int target = 15;
        System.out.println(ceilingOfANumber(arr, target));
    }


    static int ceilingOfANumber(int[] arr, int target){
        if(target > arr.length - 1){
            return -1;
        }
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr[start];
    }
    
}
