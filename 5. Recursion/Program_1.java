public class Program_1{
    public static void main(String[] args) {
        // Print 1 to n using recursion
        print1ToN(5);
        // Print n to 1 using recursion
        printNTo1(5);
    }

    private static void printNTo1(int n) {
        if(n == 0)
            return;
        
        // smaller problem
        System.out.println(n);
        printNTo1(n - 1);
    }

    private static void print1ToN(int n) {
        // base case 
        // iske aage ni jaana h 
        if(n == 0)
            return;

        // small problem
        print1ToN(n - 1);
        System.out.println(n);

    }
}