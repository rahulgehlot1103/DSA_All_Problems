public class Program_30 {
    public static void main(String[] args) {
        // find the unique number
        int[] arr = {1,1,2,3,3,4,4,5,5};
        System.out.println(uniqueElement(arr));
    }

    private static int uniqueElement(int[] arr) {
        int xor1 = 0;
        for(int i = 0; i < arr.length; i++){
            xor1 = xor1 ^ arr[i];
        }
        return xor1;
    }
}
