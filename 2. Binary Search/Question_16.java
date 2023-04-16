public class Question_16 {
    public static void main(String[] args) {
        // EKO problem from spoj
        int[] arr = {20, 15, 10, 17};
        System.out.println(maxIntLeastWood(arr, 7));
    }

    private static int maxIntLeastWood(int[] arr, int m) {
        int start = 0;
        int max = -1;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        int end = max;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isPossibleSol(arr,m, mid)){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossibleSol(int[] arr, int m, int mid) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mid){
                sum = sum + arr[i] - mid;
            }
        }
        if(sum >= m){
            return true;
        }
        return false;
    }
}
