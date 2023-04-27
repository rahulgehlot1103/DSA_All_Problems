import java.util.HashMap;
import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        try (// count freq of element using HashMap
                Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // precompute
            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (mp.containsKey(arr[i])) {
                    mp.put(arr[i], mp.get(arr[i]) + 1);
                } else {
                    mp.put(arr[i], 1);
                }
            }

            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int num = sc.nextInt();
                // fetch
                System.out.print(mp.get(num) + " ");
            }
        }
    }
}
