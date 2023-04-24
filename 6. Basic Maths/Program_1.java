public class Program_1{
    public static void main(String[] args) {
        // count digits
        int n = 1234;
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}