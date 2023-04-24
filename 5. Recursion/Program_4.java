public class Program_4 {
    public static void main(String[] args) {
        // count ways to reach N stairs
        
        System.out.println(countWaysToReachNStairs(5));
    }

    private static int countWaysToReachNStairs(int n) {

        // base case 
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        // recursive relation
        return countWaysToReachNStairs(n - 1) + countWaysToReachNStairs(n - 2);
    }
}
