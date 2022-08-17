package BinarySearch.AdityaVerma;

public class MinimumDifferenceElement {
    public static void main(String[] args){
        // suppose it is an infinite array
        int[] arr = {4, 6, 7, 10};
        int key = 7;

        int leftPos = getLeftElePos(arr,7);
        int rightPos = getRightElePos(arr,7);
        if((key - arr[leftPos]) <= (arr[rightPos] - key))
            System.out.println(arr[leftPos]);
        else
            System.out.println(arr[rightPos]);

      //  System.out.println(getPosAtInfiniteArray(arr));
    }

    public static int getLeftElePos(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] < key && arr[mid+1] > key)
                return mid;
            else if(arr[mid] > key)
                end = mid -1;
            else if(arr[mid] < key)
                start = mid + 1;
        }
        return -1;
    }

    public static int getRightElePos(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] > key && arr[mid-1] < key)
                return mid;
            else if(arr[mid] > key)
                end = mid -1;
            else if(arr[mid] < key)
                start = mid + 1;
        }
        return -1;
    }
}
