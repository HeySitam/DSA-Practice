package Arrays.BabbarSheet;

import java.util.*;

public class UnionIntersection {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5,6,9};
        new UnionSolution().hashSetApproach(a,a.length,b,b.length);
    }
}

class UnionSolution{
    // T.C -> O(m*log(m) + n*log(n))
    void hashSetApproach(int[] a, int n, int[] b, int m){
        HashSet<Integer> list = new HashSet<>();
        for(int i = 0; i<n; i++){
            list.add(a[i]);
        }
        for(int i= 0; i<m; i++){
            list.add(b[i]);
        }

        for(int item: list){
            System.out.print(item + " ");
        }
    }

    // T.C -> O(m+n)
    void hashMapApproach(int[] a, int n, int[] b, int m){

    }

    // T.C -> O(m*n)
    void naiveApproach(int[] a, int n, int[] b, int m){

    }

    // T.C -> O((m+n)log m) if m < n
    // T.C -> O((m+n) log n) if m > n
    void searchingSortingApproach(int[] a, int n, int[] b, int m){

    }
}

class IntersectionSolution{
    // T.C -> O(m*log(m) + n*log(n))
    int[] hashSetApproach(int[] a, int n, int[] b, int m){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(a[i]);
        }

        for( int i = 0; i<m; i++)
        {
            if(set.contains(a[i]))
              list.add(a[i]);
        }
        int arr[] = {};
        if(!list.isEmpty()) {
            arr = new int[list.size()];
            int pos = 0;
            for (int i : list) {
                arr[pos] = i;
                pos++;
            }
        }
        return arr;
    }

    // T.C -> O(m+n)
    void hashMapApproach(int[] a, int n, int[] b, int m){

    }

    // T.C -> O(m*n)
    void naiveApproach(int[] a, int n, int[] b, int m){

    }

    // T.C -> O((m+n)log m) if m < n
    // T.C -> O((m+n) log n) if m > n
    void searchingSortingApproach(int[] a, int n, int[] b, int m){

    }
}
