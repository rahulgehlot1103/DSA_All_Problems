import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        // Program for row wise sum

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


            printRowSum(arr);

            int max = largestRowSum(arr);
            System.out.println(max);
        }
    }

    private static int largestRowSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = 0 ; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j< arr[0].length; j++){
                sum = sum + arr[i][j];
            }
            if(sum > max){
                max = sum;
                index = i;
            }
        }
        System.out.println("max sum is: " + max);
        return index;
    }

    private static void printRowSum(int[][] arr) {
        for(int i = 0 ; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j< arr[0].length; j++){
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }
    }

    
}