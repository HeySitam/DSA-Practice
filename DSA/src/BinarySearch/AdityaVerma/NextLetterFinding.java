package BinarySearch.AdityaVerma;

public class NextLetterFinding {
    public static void main(String[] args) {
        char[] arr = {'a','b','f','h','j','l','o'};
        System.out.println(arr[getNextLetter(arr, 'm')]);
    }

    public static int getNextLetter(char[] arr, char k){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if(arr[mid] == k)
                return mid+1;
            else if (arr[mid] > k && arr[mid-1] <= k)
                return mid;
            else if (arr[mid] > k)
                end = mid - 1;
            else if (arr[mid] < k)
                start = mid + 1;
        }
        return -1;
    }
}
