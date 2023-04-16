
public class Question_3 {
    public static void main(String[] args) {
        // reverse integer
        int n = 123;
        int ans = 0;
        while(n != 0){
            int rem = n % 10;
            ans = (ans * 10) + rem;
            n = n / 10;
        }
        System.out.println(ans);
    }
}