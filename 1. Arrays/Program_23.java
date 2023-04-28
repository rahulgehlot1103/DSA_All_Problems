public class Program_23 {
    public static void main(String[] args) {
        // Remove duplicates from the array
        int[] arr = {1,1,1,2,2,3,3,3};
       int ans =  removeDuplicates(arr);
       for(int i = 0; i < ans; i++){
		System.out.print(arr[i] + " ");
	}
    }

    private static int removeDuplicates(int[] arr) {
        int i = 0;
        for(int j = i + 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i + 1] = arr[j];
                i++;
            }
        }

        return i + 1;
    }
}
