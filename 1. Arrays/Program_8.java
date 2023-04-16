public class Program_8 {
    public static void main(String[] args) {
        // find unique element in an array
        int[] arr = {1, 3, 6, 3, 2, 1, 2};

        System.out.println(findUnique(arr));
        System.out.println(findUniqueOptimised(arr));
    }

    private static int findUniqueOptimised(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans = ans ^ arr[i];
            System.out.print(ans + " ");
        }
        return ans;
    }

    private static int findUnique(int[] arr) {

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == 1)
                return arr[i];
        }
        return -1;
    }
}
