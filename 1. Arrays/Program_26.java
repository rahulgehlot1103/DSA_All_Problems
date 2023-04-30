import java.util.ArrayList;

public class Program_26 {
    public static void main(String[] args) {
        // Intersection of two arrays
        int[] a = {1,2,2,3,3,4,5,6,6};
        int[] b = {2,3,3,4,5,6,7};
        ArrayList<Integer> al = intersectionofArrays(a, b);
        System.out.println(al);
    }

    private static ArrayList<Integer> intersectionofArrays(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            }else if(a[i] > b[j]){
                j++;
            }else{
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
