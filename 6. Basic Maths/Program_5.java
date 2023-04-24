import java.util.ArrayList;
import java.util.Collections;

public class Program_5 {
    public static void main(String[] args) {
        // print all divisors
        int n = 36;

        // for(int i = 1; i <= n; i++){
        //     if(n % i == 0){
        //         System.out.print(i + " ");
        //     }
        // }

        // optimised sol
        printDivisor(n);

        
    }

    private static void printDivisor(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                // System.out.print(i + " ");
                al.add(i);
                if((n/i) != i){
                    al.add(n / i);
                }
            }
           
        }
        Collections.sort(al);

        System.out.println(al);
    }
}
