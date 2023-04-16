public class Question_4 {
    public static void main(String[] args) {
        // compliment of base 10 integer

        int n = 5;

        int m = n;
        int mask = 0;
        while(m != 0){
            mask = (mask << 1) | 1;
            m = m >> 1;
        }
        
        int ans = (~n) & mask;
        System.out.println(ans);
    }
    
}
