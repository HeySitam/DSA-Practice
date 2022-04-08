package BabbarSheet.arrays;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        long[] arr = {2, 5, 5, 6, 10, 5, 13, 5, 25, 6};
        Pair obj = approach3(arr, arr.length);
        System.out.println("max = " + obj.max + " ,min = " + obj.min);
    }

    static Pair myApproach(long a[], long n) {
        // TC = O(n)
        long max = a[0], min = a[0];
        for (int i = 0; i < n; i++) {

            if (max < a[i]) max = a[i];
            else if (min > a[i]) min = a[i];
        }
        return new Pair(min, max);
    }

    static Pair approach1(long arr[], long n) {
        // TC = O(n)
        Pair minmax = new Pair();
        int i;

        /*If there is only one element then return it as min and max both*/
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

        /* If there are more than one elements, then initialize min
           and max*/
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }

        return minmax;
    }

    static Pair approach2(long a[], int start, int end) {
        // TC = O(n)
        // Recursive approach, Divide and Conquer
        Pair mm = new Pair();
        Pair mmL = new Pair();
        Pair mmR = new Pair();

        /**
         * if there has only one elemnet
         */
        if (start == end) {
            mm.max = a[start];
            mm.min = a[start];
            return mm;
        }

        /**
         * if there has two elements
         */
        if (end == start + 1) {
            if (a[start] > a[end]) {
                mm.max = a[start];
                mm.min = a[end];
            } else {
                mm.min = a[start];
                mm.max = a[end];
            }
            return mm;
        }

        /**
         * for greater then 2 elements
         */
        int mid = (start + end) / 2;
        mmL = approach2(a, start, mid);
        mmR = approach2(a, mid + 1, end);

        if (mmL.min < mmR.min) {
            mm.min = mmL.min;
        } else {
            mm.min = mmR.min;
        }

        /* compare maximums of two parts*/
        if (mmL.max > mmR.max) {
            mm.max = mmL.max;
        } else {
            mm.max = mmR.max;
        }
        return mm;
    }

    static Pair approach3(long a[], long n) {
        // TC = O(n)
        Pair mm = new Pair();
        int i;
         if(n%2 == 0){
             if(a[0]>a[1]){
                 mm.max = a[0];
                 mm.min = a[1];
             } else {
                 mm.min = a[0];
                 mm.max = a[1];
             }
             i= 2;
         } else {
             mm.max = a[0];
             mm.min = a[0];
             i = 1;
         }

         for (;i<n-1; i+=2){
             long min = Math.min(a[i],a[i+1]);
             long max = Math.max(a[i],a[i+1]);
             if (mm.min > min){
                 mm.min = min;
             }
             if (mm.max<max){
                 mm.max = max;
             }
         }
        return mm;
    }

}

class Pair {
    long min, max;

    public Pair(long min, long max) {
        this.min = min;
        this.max = max;
    }

    public Pair() {

    }
}
