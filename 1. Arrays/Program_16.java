public class Program_16 {
    public static void main(String[] args) {
        // move all zeroes to end
        int[] arr = { 8, 5, 0, 10, 0, 0, 5, 6 };
        print(arr);
        moveZeroes(arr);
        print(arr);
    }

    private static void moveZeroes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                swap(arr, i, count);
                count++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
