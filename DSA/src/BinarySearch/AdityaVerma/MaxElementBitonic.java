package BinarySearch.AdityaVerma;

public class MaxElementBitonic {
    public static void main(String[] args){
        int[] arr = {1, 3, 8, 12, 4, 2};
        System.out.println(arr[getMaxPos(arr)]);

    }

    /**
     * As same as peak element problem
     */
    public static int getMaxPos(int[] arr){
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
