package BinarySearch.AdityaVerma;

import BinarySearch.BinarySearchImpl;

public class FindAtRotatedSortedArray {

    public static void main(String[] args){
        int[] arr = {10,12,13,20,2,4,6,8};
        int len = arr.length;
        int minPos = CountRotation.getMinElementPos(arr);
        int posInLeft = BinarySearchImpl.binarySearch(arr,0,minPos-1,6);
        int posInRight = BinarySearchImpl.binarySearch(arr,minPos,len-1,6);

        if(posInLeft != -1){
            System.out.println(posInLeft);
        } else if(posInRight != -1){
            System.out.println(posInRight);
        }
    }
}
