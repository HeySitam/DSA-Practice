package BinarySearch;

public class BinarySearchImpl {
    public static void main(String[] args){
     BinarySearch bs = new BinarySearch();
     int[] arr = {1,2,3,4,5,6,7,8,9,10};
     int idx = bs.binarySearch(arr,11);
     System.out.println(idx);
    }
}

class BinarySearch {
    public int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] > key)
                end = mid-1;
            else if(arr[mid] < key)
                start = mid+1;
        }

        return -1;
    }
}
