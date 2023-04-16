public class Program_15 {
    public static void main(String[] args) {
        // merge two sorted array
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 2, 4, 6 };

        int[] ans = mergeSortedArray(a, b);
        for(int val: ans){
            System.out.print(val + " ");
        }
    }

    private static int[] mergeSortedArray(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {    //b[j] < a[i]
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        // adding the remaing elements of array a
        while (i < a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }

        // adding the remaining elements of array b
        while (i < b.length) {
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;
    }
}
