// import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        // decimal to binary
        int n = 10;

        int ans = 0;
        int i = 0;
        while(n != 0){
            int bit = n & 1;
            ans += (bit * Math.pow(10, i));
            n = n >> 1;
            i++;
        }

        System.out.println(ans);

    }
}
