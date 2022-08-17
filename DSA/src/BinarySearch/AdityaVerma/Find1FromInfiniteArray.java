package BinarySearch.AdityaVerma;

import BinarySearch.BinarySearchImpl;

public class Find1FromInfiniteArray {
    public static void main(String[] args){
        // suppose it is an infinite array
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        System.out.println(getPosAtInfiniteArray(arr));
    }

    public static int getPosAtInfiniteArray(int[] arr){
        int start = 0;
        int end = 1;

        // allocating start and end at proper position
        while (arr[end] != 1) {
            start = end;
            end = end*2;
        }
        int pos =  getFirst1Pos(arr,start,end);

        return pos;
    }

    public static int getFirst1Pos(int[] arr,int start,int end){
        while(start <= end){
            int mid = start + ((end - start)/2);

            if(arr[mid] == 1 && arr[mid-1] == 0)
                return mid;
            else if(arr[mid] == 1)
                end = mid - 1;
            else if(arr[mid] == 0)
                start = mid + 1;
        }

        return -1;
    }
}
