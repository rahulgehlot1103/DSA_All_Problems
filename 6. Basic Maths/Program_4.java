public class Program_4 {
    public static void main(String[] args) {
        // Armstrong number
        // eg: 123 then sum of cube of each number = 123

        int n = 371;
        int temp = n;
        int sum  = 0;
        while(temp >  0){
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if(sum == n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
