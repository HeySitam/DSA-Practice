package BinarySearch.AdityaVerma;

public class CountElementInSortedArray {
    static int findFirstOcc(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key && arr[mid-1] < arr[mid]) {
                return mid;
            } else if(arr[mid] > key || arr[mid]== arr[mid-1])
                end = mid-1;
            else if(arr[mid] < key)
                start = mid+1;
        }

        return -1;
    }

    static int findLastOcc(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key && arr[mid+1] > arr[mid]) {
                return mid;
            } else if(arr[mid] > key)
                end = mid-1;
            else if(arr[mid] < key || arr[mid]== arr[mid+1])
                start = mid+1;
        }

        return -1;
    }

    static int getCount(int[] arr, int key){
        int firstOcc = findFirstOcc(arr,key);
        int lastOcc = findLastOcc(arr,key);
        return lastOcc - firstOcc +1;
    }

    public static void main(String[] args){
        FirstLastOccurance bs = new FirstLastOccurance();
        int[] arr = {2,4,8,10,10,10,19,21,30,31};
        System.out.println(getCount(arr,8));
    }
}
