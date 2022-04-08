package BabbarSheet.arrays;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};
        myApproach(arr1);
        approach2(arr2);
    }

    static void myApproach(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < (arr.length / 2) + 1; i++, j--) {
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
}
