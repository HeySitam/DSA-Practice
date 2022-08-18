package BinarySearch.AdityaVerma;


public class BinarySearchOnReverseSortedArray {

    public static void main(String[] args){
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int key = 2;
        int start = 0;
        int end = arr.length-1;
        int pos = getPos(arr, key, start, end);
        System.out.println(pos);
    }

    public static int getPos(int[] arr, int key, int start, int end) {
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key)
                end = mid-1;
            else if(arr[mid] > key)
                start = mid+1;
        }
        return -1;
    }

}

