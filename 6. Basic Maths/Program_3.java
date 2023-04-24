public class Program_3 {
    public static void main(String[] args) {
        // check if palindrome

        int n = 1121;
        int rev = 0;
        int temp = n;

        while(temp > 0){
            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }

        if(rev == n)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
