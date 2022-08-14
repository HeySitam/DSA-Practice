package BinarySearch.AdityaVerma;

public class CountRotation {
    static int getMinElementPos(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int N = arr.length;
        if(arr[start] < arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = start + ((end-start)/2);
            int prev = (mid+N-1)%N;
            int next = (mid+1)%N;
            if(arr[mid] < arr[prev] && arr[mid] < arr[next])
                return mid;
            else if(arr[end] > arr[mid])
                end = mid-1;
            else if(arr[start] < arr[mid]){
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {10,12,13,20,2,4,6};
        int len = arr.length;
        int cnt = len - getMinElementPos(arr);
        System.out.println(cnt);
    }
}
