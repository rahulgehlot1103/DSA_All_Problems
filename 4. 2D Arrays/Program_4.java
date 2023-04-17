import java.util.ArrayList;

public class Program_4 {
    public static void main(String[] args) {
        // Spiral Print
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

       ArrayList<Integer> ans =  printSpiral(arr);
       System.out.print(ans + " ");
    }

    private static ArrayList<Integer> printSpiral(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        int total = arr.length * arr[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        while(count < total){
            // 1st row, col changes
            for(int i = startCol; i <= endCol && count < total; i++){
                ans.add(arr[startRow][i]);
                count++;
            }
            startRow++;
            // row changes, last col
            for(int i = startRow; i <= endRow && count < total; i++){
                ans.add(arr[i][endCol]);
                count++;
            }
            endCol--;
            // last row, col changes
            for(int i = endCol; i >= startCol && count < total; i--){
                ans.add(arr[endRow][i]);
                count++;
            }
            endRow--;
            // row changes, 1st col;
            for(int i = endRow; i >= startRow && count < total; i--){
                ans.add(arr[i][startCol]);
                count++;
            }
            startCol++;
        }
        return ans;
    }
}
