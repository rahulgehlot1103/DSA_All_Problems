public class Program_6 {
    public static void main(String[] args) {
        // check for prime
        int n = 12;

        boolean isPrime = checkPrime(n);
        System.out.println(isPrime);
    }

    private static boolean checkPrime(int n) {
        int count = 0;
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                count++;
                if(n / i != i){
                    count++;
                }
            }
        }
        if(count == 2)
            return true;
        else
            return false;
    }
}
