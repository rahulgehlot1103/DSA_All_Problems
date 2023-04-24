public class Program_11 {
    public static void main(String[] args) {
        // check if string is palindrome or not
        String str = "MADAoM";
        boolean ans = checkPalindrome(0, str);
        System.out.println(ans);
    }

    private static boolean checkPalindrome(int start, String str) {
        int n = str.length();
        if(start >= n / 2)
            return true;
        if(str.charAt(start) != str.charAt(n- start - 1))
            return false;

        return checkPalindrome(start + 1, str);
        // return false;
    }
}
