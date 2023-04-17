import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        // taking input/output in 2D dimensional array
        try (Scanner sc = new Scanner(System.in)) {
            int[][] arr = new int[3][3];

            // taking input
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // output
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("enter the element you want to search");
            int n = sc.nextInt();
            System.out.println(isPresent(arr, n));
        }
    }

    // search the element in an array
    private static boolean isPresent(int[][] arr, int n) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == n){
                    return true;
                }
            }
        }
        return false;
    }
}