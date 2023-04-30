import java.util.ArrayList;

public class Program_27 {
    public static void main(String[] args) {
        // Union in an array
        int[] a = { 1, 1, 2, 3, 4, 5 };
        int[] b = { 2, 2, 3, 4, 4, 5, 6 };

        ArrayList<Integer> ans = union(a, b);
        System.out.println(ans);
    }

    private static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } else {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while (i < a.length) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (ans.size() == 0 || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }
        return ans;
    }
}