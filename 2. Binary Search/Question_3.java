public class Question_3 {
    public static void main(String[] args) {
        // floor of the number
        int[] arr = {2, 4, 5, 6, 9, 12, 18, 23, 56, 76, 123};
        int target = 15;
        System.out.println(floorOfANumber(arr, target));
    }


    static int floorOfANumber(int[] arr, int target){
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
        return arr[end];
    }
}
