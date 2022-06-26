package Arrays.BabbarSheet;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};
       recursiveApproach(arr1,0);
    }

    static void myApproach(int[] arr) {
        int arrLength = arr.length;
        int lastIndex = arrLength - 1;
        for (int i = 0, j = lastIndex; i < (arrLength / 2) + 1; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void approach2(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void recursiveApproach(int[] arr, int pos){
        if(pos == arr.length){
            return;
        }
        recursiveApproach(arr,pos+1);
        System.out.println(arr[pos]);
    }
}
