import java.util.Scanner;

/**
 * Progam_1
 */
public class Progam_1 {

    public static void main(String[] args) {
        try (// count the elements of array
        Scanner sc = new Scanner(System.in)) {
            int[] arr = {1,2,1,2,3};

            // precompute
            int[] hash = new int[12 + 1];
            for(int i = 0; i < arr.length; i++){
                hash[arr[i]]++;
            }


            int q = sc.nextInt();
      for(int i = 0; i < q; i++){
               int number = sc.nextInt();
               System.out.print(hash[number] + " ");
               System.out.println();
      }
        }
    }
}