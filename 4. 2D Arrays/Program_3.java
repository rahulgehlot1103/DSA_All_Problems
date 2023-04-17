import java.util.ArrayList;

public class Program_3 {
    public static void main(String[] args) {
        // Wave traversal
        int[][] arr = {{ 1, 2, 3}, {4, 5, 6}, {7, 8, 9 }};

        ArrayList<Integer> ans = waveTraversal(arr);
        System.out.print(ans +" ");
    }

    static ArrayList<Integer> waveTraversal(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int col = 0; col < arr[0].length; col++) {
            // if column is 0 or even
            if (col % 2 == 0) {
                // them top to bottom
                for (int row = 0; row < arr.length; row++) {
                    ans.add(arr[row][col]);
                }
            } else { // odd
                // bottom to top
                for (int row = arr.length - 1; row >= 0; row--) {
                    ans.add(arr[row][col]);
                }
            }
        }
        return ans;

    }
}
