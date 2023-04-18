import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        // GCD
        try (Scanner sc = new Scanner(System.in)) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if(n1 == 0)
                System.out.println(n2);
            
            if(n2 == 0)
                System.out.println(n1);
            
            
            while(n1 != n2){
                if(n1 > n2){
                    n1 = n1 - n2;
                }
                else{
                    n2 = n2 - n1;
                }
            }
            System.out.println(n1);
        }
    }
}
