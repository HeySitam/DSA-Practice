package BinarySearch.AdityaVerma;

public class CeilFind {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,10,10,12,15};
        System.out.println(getCeil(arr, 5));
    }

    public static int getCeil(int[] arr, int k){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == k || (arr[mid] > k && arr[mid-1] < k))
                return mid;
            else if (arr[mid] > k)
                end = mid - 1;
            else if (arr[mid] < k)
                start = start + 1;
        }
        return -1;
    }
}
