package BinarySearch.AdityaVerma;

public class BSOnNearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 40};
        System.out.println(searchPos(arr, 41));
    }

    public static int searchPos(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == k)
                return mid;
            if (mid != 0 && mid != arr.length - 1) {
                if (arr[mid - 1] == k)
                    return mid - 1;
                else if (arr[mid + 1] == k)
                    return mid + 1;
            }

            if (arr[mid] > k)
                end = mid - 2;
            else if (arr[mid] < k)
                start = start + 2;
        }
        return -1;
    }
}
