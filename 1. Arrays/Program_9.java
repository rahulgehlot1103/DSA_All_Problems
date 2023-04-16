public class Program_9 {
    public static void main(String[] args) {
        // find the duplicate in an array
        int [] arr = {1, 2, 3, 4, 3};

    //    int ans = findDuplicate(arr);
        int ans = findDuplicateOptimised(arr);
       System.out.println(ans);
    }

    private static int findDuplicateOptimised(int[] arr) {
        int ans = 0;
        // XOR ing all array elements
        for(int i = 0; i < arr.length; i++){
            ans = ans ^ arr[i];
        }

        // XOR [1, n - 1]
        for(int i = 1; i < arr.length; i++){
            ans = ans ^ i;
        }
        return ans;
    }

    private static int findDuplicate(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            count = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == 2)
                return arr[i];
        }
        return -1;
    }
}
