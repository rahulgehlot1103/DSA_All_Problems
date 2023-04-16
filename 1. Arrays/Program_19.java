import java.util.ArrayList;

public class Program_19 {
    public static void main(String[] args) {
        // sum of two array
        int[] a = { 9, 9, 9 };
        int[] b = { 9, 9, 9 };
        ArrayList<Integer> ans = sumOfArrrays(a, b);
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Integer> sumOfArrrays(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = a.length - 1;
        int j = b.length - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = a[i] + b[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
            j--;
        }

        // case 1
        // array a is greater than array b
        while (i >= 0) {
            int sum = a[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
        }

        // case 2
        // array b is greater than array a
        while (j >= 0) {
            int sum = b[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            j--;
        }

        // case 3
        // carry is remaining
        while (carry != 0) {
            int sum = carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
        }

        return ans;
    }
}
