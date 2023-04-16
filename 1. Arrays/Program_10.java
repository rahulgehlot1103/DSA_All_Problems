import java.util.ArrayList;

public class Program_10 {
    public static void main(String[] args) {
        // Intersection of two arrays

        int[] a = { 1, 2, 2, 3, 3, 4 };
        int[] b = {2, 2, 3, 5};

        ArrayList<Integer> ans = findIntersection(a, b);
        System.out.println(ans);
    }

    private static ArrayList<Integer> findIntersection(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = 0, n = a.length, m = b.length;

        while(i < n && j < m){
            if(a[i] < b[j]){
                i++;
            }else if(a[i] == b[j]){
                al.add(a[i]);
                i++;
                j++;
                
            }else{  //a[i] > b[j]
                j++;
            }
        }
        return al;
    }
}
