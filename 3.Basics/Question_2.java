public class Question_2 {
    public static void main(String[] args) {
        int n = 110;

        int ans = 0, i = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit == 1)
                ans += Math.pow(2, i);
            n = n / 10;
            i++;
        }
        System.out.println(ans);
    }   
}
