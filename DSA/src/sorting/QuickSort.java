package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int [] arr = {9,4,7,6,3,1,5};
        System.out.println(Arrays.toString(arr));
        quicksort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int arr[], int lo, int hi){
        if(lo<hi){
            int pivotPos = partition(arr,lo, hi);
            quicksort(arr,lo,pivotPos-1);
            quicksort(arr,pivotPos+1,hi);
        }
    }

    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                swap(arr,i,j);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        swap(arr,i+1,high);

        return i+1;
    }

    static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
