public class Program_2 {
    public static void main(String[] args) {
        // int[] arr = new int[10];
        System.out.println("Everything is fine");
        // accessing an array
        // System.out.println(arr[9]);

        //array index out of bound exception
        // accessing the element bigger than the size of the array
        // System.out.println(arr[10]);

        // int[] first = {1, 2, 3, 4, 5};
        // System.out.println("value at 1st index is :" + first[1]);


        // int[] second = {1,43,4,5,6,7,78};
        // printArray(second);


        char[] charArr = {'a', 'b', 'c', 'd', 'e'};
        printArray(charArr);

        double firstDouble[] = new double[3];
        System.out.println(firstDouble[2]);
        float firstFloat[] = new float[3];
        System.out.println(firstFloat[2]);
        boolean firstBool[] = new boolean[3];
        System.out.println(firstBool[2]);


    }

    static void printArray(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
