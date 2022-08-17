package BinarySearch.AdityaVerma;

public class PeakElement {

    // Binary Search on Answer Concept
    public static void main(String[] args){
        int[] arr = {5,10,20,15};
        System.out.println(arr[getPeakPos(arr)]);

    }

    public static int getPeakPos(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return mid;
            else if(arr[mid-1] > arr[mid])
                end = mid-1;
            else if(arr[mid+1] > arr[mid])
                start = mid+1;
        }

        return -1;
    }
}
