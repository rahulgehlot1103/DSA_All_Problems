import java.util.ArrayList;

public class Program_12 {
    public static void main(String[] args) {
        // Program to find the triplet sum in an array
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 12;
        ArrayList<Integer> ans = tripletSum(arr, sum);
        System.out.println(ans);
    }

    private static ArrayList<Integer> tripletSum(int[] arr, int sum) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[j] == sum){
                        ArrayList <Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        ans.addAll(temp);
                    }
                }
            }
        }
        return ans;
    }
}
