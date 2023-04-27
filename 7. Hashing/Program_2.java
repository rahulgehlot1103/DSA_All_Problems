import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        try (// count characters in a string
        Scanner sc = new Scanner(System.in)) {
            char [] ch = {'a', 'a', 'c', 'd', 'c', 'b'};

            //precompute
            // maximum length of character
            // using ASCII value
            int[] hash  = new int[256];
            for(int i = 0; i < ch.length; i++){
                hash[ch[i]]++;
            }

            int q = sc.nextInt();
            for(int i = 0; i < q; i++){
                char ch1 = sc.next().charAt(i);
                System.out.print(hash[ch1] + "");
            }
        }
    }
}
