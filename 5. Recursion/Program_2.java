public class Program_2 {
    public static void main(String[] args) {
        // factorial of a number using recursion
        int ans = fact(5);
        System.out.println(ans);
    }

    private static int fact(int n) {
        if(n == 0)
            return 1;

        return fact(n - 1) * n;
    }
}
