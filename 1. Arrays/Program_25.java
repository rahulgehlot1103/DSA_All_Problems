import java.util.ArrayList;

public class Program_25 {
    public static void main(String[] args) {
        // Move zeroes to end
        int[] arr = { 3, 4, 0, 5, 0 };
        // brute force
        moveZeroes(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Optimal Approach
        int[] a = { 3, 1, 4, 0, 0, 0, 2, 4, 1, 5 };
        moveZeroesToEnd(a);
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

    private static void moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        // find the first zero
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // swapping i and j if a non zero found ahead
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int swap = arr[j];
                arr[j] = arr[i];
                arr[i] = swap;
                j++;
            }
        }
    }

    private static void moveZeroes(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        // adding non zero elements in a temp array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                al.add(arr[i]);
            }
        }

        // adding non zero elements in the front
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }

        // filling the remaining arrray with zero
        for (int i = al.size(); i < n; i++) {
            arr[i] = 0;
        }

    }
}
