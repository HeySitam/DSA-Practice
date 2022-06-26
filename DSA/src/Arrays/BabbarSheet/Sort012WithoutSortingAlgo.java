package Arrays.BabbarSheet;

import java.util.Arrays;

public class Sort012WithoutSortingAlgo {
    public static void main(String[] args){
         int[] arr ={0,1,2,1,2} ;
        GFGApproach(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void myApproach(int a[], int n)
    {
        // code here
        int nextPos = 0;
        for (int i = nextPos; i<n; i++ ){
            if(nextPos!= n-1 && a[i] == 0){
                swap(a,i,nextPos);
                nextPos++;
            }
        }

        for (int i = nextPos; i<n; i++ ){
            if(nextPos!= n-1 && a[i] == 1){
                swap(a,i,nextPos);
                nextPos++;
            }
        }

        for (int i = nextPos; i<n; i++ ){
            if(nextPos!= n-1 && a[i] == 2){
                swap(a,i,nextPos);
                nextPos++;
            }
        }
    }

    public static void swap(int a[], int i, int nextPos){
        int temp = a[nextPos];
        a[nextPos] = a[i];
        a[i] = temp;
    }

    /**
     * Variation of Dutch national flag problem
     */
    public static void GFGApproach(int a[], int n){
        // code here
        int lo = 0;
        int hi = n - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0: {
                    swap(a,mid,lo);
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    swap(a,mid,hi);
                    hi--;
                    break;
                }
            }
        }
    }
}
