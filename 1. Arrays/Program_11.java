import java.util.ArrayList;
import java.util.Collections;

public class Program_11 {
    // Program to find the Pair sum in an array
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 5;

        ArrayList<Integer> ans = findPair(arr, sum);
        System.out.println(ans);
    }

    private static ArrayList<Integer> findPair(int[] arr, int sum) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    // min first then the max
                    temp.add(Math.min(arr[i], arr[j]));
                    temp.add(Math.max(arr[i], arr[j]));
                    al.addAll(temp);
                }
            }
        }
        // Arranging in non decreasing order
        Collections.sort(al);
        return al;
    }
}
