public class Question_5 {
    public static void main(String[] args) {
        // power of 2
        int n = 14;
        int ans = 1;
        boolean isPower = false;
        for(int i = 0; i <= 30; i++){
            if(ans == n){
                isPower = true;
                break;
            }
            ans = ans * 2;
        }
        if(isPower)
            System.out.println("it is power of 2");
        else
            System.out.println("it is not a power of 2");

    }
}
