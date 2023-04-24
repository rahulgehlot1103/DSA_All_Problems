public class Program_7 {
    public static void main(String[] args) {
        // sum of array using recursion
        int[] arr = {1, 2, 4, 3, 5};

        System.out.println(sumOfArray(arr, 5));
    }

    private static int sumOfArray(int[] arr, int n) {
        if(n == 0)
            return 0;
        if(n == 1){
            return arr[0];
        }
       
        int remainingPart = sumOfArray(arr, n - 1);
        int sum = arr[n - 1] + remainingPart;

        return sum;
    }
}
