package Recursion.Pepcoding.recursion_in_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. You are given a number n, representing the count of elements.
 * 2. You are given n numbers.
 * 3. You are given a number x.
 * 4. You are required to find the all indices at which x occurs in array a.
 * 5. Return an array of appropriate size which contains all indices at which x occurs in array a.
 */
public class AllIndices {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        if (idx == arr.length)
            return new int[fsf];

        if (arr[idx] == x) {
            int[] fArr =   allIndices(arr, x, idx + 1, fsf + 1);
            fArr[fsf] = idx;
            return fArr;

        } else {
            int[] fArr = allIndices(arr, x, idx + 1, fsf);
            return fArr;
        }
    }
}
