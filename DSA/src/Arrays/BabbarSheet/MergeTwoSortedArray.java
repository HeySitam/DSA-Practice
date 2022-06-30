package Arrays.BabbarSheet;

public class MergeTwoSortedArray {
    public static void main(String[] args){
       int arr1[] = {1, 3, 5, 7};
       int arr2[] = {0, 2, 6, 8, 9};

    }
}

class MergeTwoSortedArraySolution {

    /**
     * TC -> O(n1 * m1)
     * n1 = Linear Traversal of a1
     * m1 = Reordering of a2
     * =====================
     * SC _> O(1)
     */
    public void insertionSortMethod(int[] a1, int n, int[] a2, int m){
        for(int i = 0; i<n ; i++){
            if(a1[i] > a2[0]){
                int temp = a2[0];
                a2[0] = a1[i];
                a1[i] = temp;
                putIntoCorrectPos(a2,m);
            }
        }
    }
    private void putIntoCorrectPos(int[] a, int n){
        int currentPos = 0;
        for(int i = 1; i<n; i++){
            if (a[i] < a[currentPos]){
                swap(a,i,currentPos);
                currentPos = i;
            }
        }
    }

    private void swap(int arr[], int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}