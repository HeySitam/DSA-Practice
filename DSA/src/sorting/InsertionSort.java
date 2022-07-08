package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {2,6,1,7,4,9,3,11};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j= i+1; j > 0; j-- ){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }

    static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
