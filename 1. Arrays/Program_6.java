public class Program_6 {
    public static void main(String[] args) {
        int[] arr = {32, 12, 54, 67, 4, 3, 87, 65};

        for(int val: arr)
            System.out.print(val + " ");
        reverse(arr);
        System.out.println();
        for(int val: arr)
            System.out.print(val + " ");
    }

    private static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i <= j){
            swap(arr, i, j);

            i++;
            j--;
        }
    } 

    private static void swap(int[] arr, int i, int j) {
        int swap =arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}
