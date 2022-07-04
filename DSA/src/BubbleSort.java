import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {2,4,3,9,6};
        new BubbleSortSolution().sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
class BubbleSortSolution {
    void sort(int[] arr, int n){
        boolean isSwapped = false;
        for(int i = 0; i<n; i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }

    void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
