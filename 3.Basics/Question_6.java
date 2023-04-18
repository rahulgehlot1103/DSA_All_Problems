import java.util.Arrays;
import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        try (// Given an integer n, return the number of prime numbers that are strictly less than n.
        Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            
            System.out.println(isPrime(n));
        }
    }

    private static int isPrime(int n) {
        // Sieve of Eratosthenes Algorithm
        int count = 0;
        boolean[] prime = new boolean[n];
        // sb numbers to true mark kr dia
        Arrays.fill(prime, true);
        // 0 and 1 are non-prime
        prime[0] = prime[1] = false;
        for(int i = 2; i < n; i++){
            // assuming as a prime 
            if(prime[i] == true){
                count++;
                // i ke table waaalo ko non prime mark krdo
                for(int j = 2 * i; j < n; j = j + i)
                    prime[j] = false;
            }
        }
        return count;
    }
}