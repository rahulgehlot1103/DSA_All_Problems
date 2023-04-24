public class Program_8{
    public static void main(String[] args) {
        // Linear search
        int[] arr = {5,2,6,23,7};
        boolean ans = search(arr, arr.length, 5);
        System.out.println(ans);
    }

    private static boolean search(int[] arr, int n, int target) {
        // print(arr , n);
        if(n == 0)
        return false;

        if(arr[n - 1] == target){
            return true;
        }

        return search(arr, n - 1, target);
    }

    // private static void print(int[] arr, int n) {
    //     System.out.println("size of the array is: " + n);
    //     for(int i = 0; i < n; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }
}