/**
 * Program_22
 */
public class Program_22 {

    public static void main(String[] args) {
        
        // check if array is sorted
        int[] arr = {1,2, 7, 7};
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    private static boolean isSorted(int[] arr) {
                // O(n)
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }
}