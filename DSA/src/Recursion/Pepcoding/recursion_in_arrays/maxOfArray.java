package Recursion.Pepcoding.recursion_in_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. You are given a number n, representing the count of elements.
 * 2. You are given n numbers.
 * 3. You are required to find the maximum of input.
 * 4. For the purpose complete the body of maxOfArray function. Don't change the signature.
 */
public class maxOfArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

       int max =  maxOfArray(arr,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1) return arr[idx];
        int fMax = maxOfArray(arr,idx+1);
         if(fMax > arr[idx])
             return fMax;
         else
             return arr[idx];
    }
}
