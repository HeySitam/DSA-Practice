package BinarySearch.AdityaVerma;

import BinarySearch.BinarySearchImpl;

public class SearchBitonicArray {
    public static void main(String[] args){
        int[] arr = {1, 3, 8, 12, 4, 2};
        int key = 12;
        int maxPos = MaxElementBitonic.getMaxPos(arr);
        int leftSearch = BinarySearchImpl.binarySearch(arr, 0, maxPos,key);
        int rightSearch = BinarySearchOnReverseSortedArray.getPos(arr,key,maxPos+1,arr.length-1);
        if(leftSearch != -1)
         System.out.println(leftSearch);
        else
            System.out.println(rightSearch);
    }
}
