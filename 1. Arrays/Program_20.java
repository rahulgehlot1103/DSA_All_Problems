/**
 * Program_20
 */
public class Program_20 {
    public static void main(String[] args) {
        int[] arr = {12, 42, 1, 332, 22, 232};
        int ans = largest(arr, arr.length);
        System.out.println(ans);
    }
    
    public static int largest(int arr[], int n)
    {
        // O(nlogn)
        // Arrays.sort(arr);
        
        // int ans = arr[n - 1];
        
        // return ans;
        
        // O(n)
        int max = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        
        return max;
    }
}