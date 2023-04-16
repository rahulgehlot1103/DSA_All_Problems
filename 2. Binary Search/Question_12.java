import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sqrt(n);
        System.out.println(morePrecision(n, 3, ans));
    }

    private static double morePrecision(int n, int precision, int ans) {
        double factor = 1;
        double tempAns = ans;
        for (int i = 0; i < precision; i++) {
            // 0.1
            // 0.01
            //0.001
            factor = factor / 10;
            for (double j = tempAns; j * j < n; j += factor) {
                tempAns = j;
            }
        }
        return tempAns;
    }

    private static int sqrt(int n) {
        int start = 0, end = n;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sq = mid * mid;
            if (sq == n) {
                return mid;
            }
            if (sq < n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
