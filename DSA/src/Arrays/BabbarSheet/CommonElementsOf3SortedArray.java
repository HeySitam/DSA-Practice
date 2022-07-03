package Arrays.BabbarSheet;

import java.util.ArrayList;

public class CommonElementsOf3SortedArray {
    public static void main(String[] args) {
        int[] a1 = {1, 5, 10, 20, 40, 80};
        int[] a2 = {6, 7, 20, 80, 100};
        int[] a3 = {3, 4, 15, 20, 30, 70, 80, 120};
        new CommonElementsSolution().optimized(a1, a2, a3, a1.length, a2.length, a3.length);
    }
}

class CommonElementsSolution {
    public void optimized(int[] a1, int[] a2, int[] a3, int n1, int n2, int n3) {
            // code here
            ArrayList<Integer> list = new ArrayList<>();
            int x =0, y= 0, z= 0;
            int commonElements;
            while(x< n1 && y< n2 && z<n3){
                if(a1[x] == a2[y] && a2[y] == a3[z]){
                    commonElements = a1[x];
                    if(!list.contains(commonElements))
                        list.add(a1[x]);
                    x++;
                    y++;
                    z++;
                } else if (a1[x] < a2[y]){
                    x++;
                } else if (a2[y] < a3[z]){
                    y++;
                } else {
                    z++;
                }
            }
        System.out.println(list);
    }
}