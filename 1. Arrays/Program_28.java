public class Program_28 {
    public static void main(String[] args) {
        // find the missing number in an array
        int[] arr = {1,2,4,5};

        System.out.println(missingNumber(arr));
       
        System.out.println(missingNumberOptimised(arr));
    }

    private static int missingNumberOptimised(int[] arr) {
        int n = arr.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i < n - 1; i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }

    private static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        int sum2 = 0;
        for(int i = 0; i < n - 1; i++){
            sum2 += arr[i];
        }
        return (sum - sum2);
    }
}
