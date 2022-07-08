package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int [] arr = {9,4,7,6,3,1,5};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr,int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    static void merge(int[] arr, int l, int mid, int r){
        int i = l;
        int j = mid+1;
        int[] res = new int[arr.length];
        int resPos = l;
        while(i <= mid && j <= r){
            if(arr[i] > arr[j]){
               // swap(arr,i,j);
                res[resPos] = arr[j];
                   j++;
            } else {
                res[resPos] = arr[i];
                  i++;
            }
            resPos++;
        }

        // right array is exhausted
        if(j > r){
            while(i <= mid){
                res[resPos] = arr[i];
                i++;
                resPos++;
            }
        }

        // left array is exhausted
        if(i > mid){
            while(j <= r){
                res[resPos] = arr[r];
                j++;
                resPos++;
            }
        }

        for(int p = l; p <= r; p++){
            arr[p] = res[p];
        }
    }

}
