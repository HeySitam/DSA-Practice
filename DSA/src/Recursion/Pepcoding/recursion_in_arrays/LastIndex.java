package Recursion.Pepcoding.recursion_in_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. You are given a number n, representing the count of elements.
 * 2. You are given n numbers.
 * 3. You are given a number x.
 * 4. You are required to find the last index at which x occurs in array a.
 * 5. If x exists in array, print the last index where it is found otherwise print -1.
 */
public class LastIndex {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int x = Integer.parseInt(br.readLine());
        int pos =  lastIndex(arr, 0, x);
        System.out.println(pos);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx == arr.length)
            return -1;

        int fPos = lastIndex(arr, idx + 1, x); //return the pos of X from (idx+1) pos
        if (arr[idx]==x && fPos == -1)
            return idx;
        else
            return fPos;

    }
}
