
public class Program_21 {
    public static void main(String[] args) {
        // Program to find the 2nd largest element in the array
        int[] arr = { 1, 2, 7, 5, 7, 6 };
        int ans = secondLargest(arr, arr.length);
        System.out.println(ans);
    }

    private static int secondLargest(int[] arr, int n) {

            // O(2n)

        // int largest = arr[0];
        // for (int i = 1; i < n; i++) {
        //     if (arr[i] > largest) {
        //         largest = arr[i];
        //     }
        // }
        // int sLargest = -1;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > sLargest && arr[i] < largest) {
        //         sLargest = arr[i];
        //     }
        // }
        // return sLargest;

        // O(n)
        int largest = arr[0];
        int sLargest = -1;
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > sLargest){
                sLargest = arr[i];
            }
        }

        return sLargest;
    }
}
