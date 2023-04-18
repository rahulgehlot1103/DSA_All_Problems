import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        try (// fast exponention
        Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int n = sc.nextInt();

            int res = 1;
            while(n > 0){
                if(n % 2 != 0){
                    res = res * x;
                }
                x = x * x;
                n = n >> 1;
            }

            System.out.println(res);
        }
    }
}
