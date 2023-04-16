public class Program_4 {
    public static void main(String[] args) {
        // sum of array
        int[] arr = {1, 2, 3, 4, 5};

        int ans = sumOfElement(arr);
        System.out.println(ans);
    }

    private static int sumOfElement(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
