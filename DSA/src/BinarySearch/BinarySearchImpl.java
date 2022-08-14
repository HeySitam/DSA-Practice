package BinarySearch;

public class BinarySearchImpl {
    public static void main(String[] args){
     int[] arr = {1,2,3,4,5,6,7,8,9,10};
     int idx = binarySearch(arr,0, arr.length-1,6);
     System.out.println(idx);
    }

    public static int binarySearch(int[] arr,int start,int end, int key){
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

