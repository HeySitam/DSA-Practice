package BinarySearch.AdityaVerma;


public class BinarySearchOnReverseSortedArray {

    public static void main(String[] args){
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int pos = -1;
        int key = 2;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key) {
                pos = mid;
                break;
            } else if(arr[mid] < key)
                end = mid-1;
            else if(arr[mid] > key)
                start = mid+1;
        }

        System.out.println(pos);
    }

}

