import java.util.Scanner;

public class Program_1{
    public static void main(String[] args) {
        // all about arrays
        Scanner sc = new Scanner(System.in);
        int[] arr;  //declaration
        arr = new int[5];   //intialization
        

        // taking input from the user
        for(int i = 0; i < arr.length - 2; i++){
            arr[i] = sc.nextInt();
        }

        // printing the values of array
        printArray(arr);

        // insertion in array
        
        insert(arr, 1, 22);
        printArray(arr);
    }

    static void insert(int[] arr, int pos, int element){
        int size = arr.length;
        if(pos < 0 || pos > size - 1)
            System.out.println("wrong position");
        for (int i = size - 2; i >= pos; i++) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = element;
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}