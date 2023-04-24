public class Program_2 {
    public static void main(String[] args) {
        // reverse a number
        int n = 1234;
        int rev = 0;
        
        while(n > 0){
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }

        System.out.println(rev);
    }
}
