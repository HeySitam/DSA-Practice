package Recursion.Pepcoding.recursion_in_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to print the elements of array from beginning to end each in a separate line.
 * 4. For the above purpose complete the body of displayArr function. Don't change the signature.
 */
public class DisplayArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }

}
