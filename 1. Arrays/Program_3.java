public class Program_3 {
    public static void main(String[] args) {
        // maximum and minimum in an array

        int[] arr = {32, 12, 54, 67, 4, 3, 67, 87,65};

        int isMax = maxElement(arr);
        int isMin = minElement(arr);

        System.out.println("maximum is: " + isMax + " Minimum is: " + isMin);
    }

    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            // if(arr[i] > max){
            //     max = arr[i];
            // }
            max = Math.max(arr[i], max);
        }
        return max;
    } 

    public static int minElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            // if(arr[i] < min){
            //     min = arr[i];
            // }

            min = Math.min(arr[i] , min);
        }
        return min;
    }
    
}
