public class Program_5 {
    public static void main(String[] args) {
        sayDigit(213,arr);
        
    }

    static String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static void sayDigit(int n, String[]arr) {
        if(n == 0){
            return;
        }

        // processing
        int digit =  n % 10;
        
        // recursive call
        sayDigit(n / 10, arr);
        System.out.println(arr[digit]);
    }
}
