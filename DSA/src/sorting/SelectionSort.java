package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {2,6,1,7,4,9,3,11};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int minPos = i;
            for(int j = i+1; j< n; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            if(arr[i] > arr[minPos])
                swap(arr,i, minPos);
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
