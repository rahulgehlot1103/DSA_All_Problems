public class Program_6 {
    public static void main(String[] args) {
        // Rotate array by 90 degree
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[0].length; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
        rotateArrayBy90Degree(arr);
    }

    private static void rotateArrayBy90Degree(int[][] arr) {
        // transpose the array
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i; j < arr[0].length; j++) {
        //         int swap = arr[i][j];
        //         arr[i][j] = arr[j][i];
        //         arr[j][i] = swap;
        //     }
        // }

        // // reverse the transposed array
        // for (int i = 0; i < arr.length; i++) {
        //     int li = 0;
        //     int ri = arr[0].length - 1;
        //     while (li < ri) {
        //         int swap = arr[i][li];
        //         arr[i][li] = arr[i][ri];
        //         arr[i][ri] = swap;
        //     }
        // }

        for(int j = arr.length - 1; j >= 0; j--){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
