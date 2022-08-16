package BinarySearch.AdityaVerma;

import BinarySearch.BinarySearchImpl;

public class FindAtInfiniteSortedArray {
    public static void main(String[] args){
        // suppose it is an infinite array
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};

        System.out.println(getPosAtInfiniteArray(arr,7));
    }

    public static int getPosAtInfiniteArray(int[] arr, int k){
        int start = 0;
        int end = 1;

        // allocating start and end at proper position
        while (arr[end] < k) {
            start = end;
            end = end*2;
        }
       int pos =  BinarySearchImpl.binarySearch(arr,start,end,k);

        return pos;
    }
}
