package Arrays.BabbarSheet;

import java.util.Arrays;

public class RotateArrayByOne {

    public static void main(String[] args){
        int a[] = {3,5,9,8};
        RotateArrayByOneSolution obj = new RotateArrayByOneSolution();
        obj.rotateLA(a, a.length);
        System.out.print(Arrays.toString(a));
    }

}

class RotateArrayByOneSolution {

    // Linear Approach
    public void rotateLA(int[] arr, int n){
        for( int i=n-2, j = n-1; i >= 0; i--,j--){
            swap(arr,i,j);
        }
    }

    // Recursive Approach
    public void rotateRec(int[] arr, int n, int pos){
        if(pos == n-1)
            return;

        rotateRec(arr,n,pos+1);

        swap(arr, pos, pos+1);
    }

    private void swap(int arr[], int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
