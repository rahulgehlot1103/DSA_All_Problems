public class Program_3 {
    public static void main(String[] args) {
        // fibonnaci no.

        int ans = fibo(8);
        System.out.println(ans);
    }

    private static int fibo(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}
