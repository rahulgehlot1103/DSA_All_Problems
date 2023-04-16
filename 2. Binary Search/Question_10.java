public class Question_10 {
    public static void main(String[] args) {
        // program to find minimum absolute difference
        int arr [] = {2,2,3,4,7,9,25,56,88,94};
        System.out.println(findMinAbsDifference(arr, 0));
    }

    static int findMinAbsDifference(int[] arr, int target){
        int ans = -1;
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }else if(arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        // if element exists then ans will be zero
        int res = 0;
        // if target if not in the array
        if(ans == -1){
            if(end == -1)
                res = Math.abs(target - arr[start]);
            else if(start == arr.length) 
                res = Math.abs(target - arr[end]);
            else{
                int a1 = Math.abs(target - arr[start]);
                int a2 = Math.abs(target - arr[end]);
                res = Math.min(a1, a2);
            }   
        }
        else{
            res = 0;
        }
        return res;
    }
}
