public class Program_5 {
    public static void main(String[] args) {
        // linear search

        int[] arr = {32, 12, 54, 67, 4, 3, 67, 87,65};

        boolean ans = search(arr, 31);
        System.out.println(ans);
    }

    private static boolean search(int[] arr, int key) {

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key)
                return true;
        }
        return false;
    }
}
