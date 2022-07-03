package Arrays.BabbarSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {7, 9, 9, 10, 11, 11, 13, 14, 17, 19};
        int arr2[] = {1, 1, 4, 5, 8, 11, 13, 16, 19, 19};
        new MergeTwoSortedArraySolution().merge(arr1, arr2, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
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
    public void insertionSortMethod(int[] a1, int n, int[] a2, int m) {
        for (int i = 0; i < n; i++) {
            if (a1[i] > a2[0]) {
                int temp = a2[0];
                a2[0] = a1[i];
                a1[i] = temp;
                putIntoCorrectPos(a2, m);
            }
        }
    }

    private void putIntoCorrectPos(int[] a, int n) {
        int currentPos = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[currentPos]) {
                swap(a, i, currentPos);
                currentPos = i;
            }
        }
    }

    private void swap(int arr[], int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // GAP algorithm .....most optimized method
    // My implementation

    /**
     * TC -> O(NlogN)
     * SC -> O(1)
     */
    public void gapAlgo(int[] a1,
                        int[] a2, int n,
                        int m) {
        int totalLen = n + m;
        int gap = (int) Math.ceil(totalLen / 2);
        while (gap > 0) {
            for (int i = 0, j = i + gap; j < totalLen; i++, j++) {
                if (i < n) {
                    if (j < n) {
                        if (a1[i] > a1[j]) swap(a1, i, j);
                    } else {
                        if (a1[i] > a2[j - n]) {
                            int temp = a1[i];
                            a1[i] = a2[j - n];
                            a2[j - n] = temp;
                        }
                    }
                } else {
                    if (a2[i - n] > a2[j - n]) swap(a2, i - n, j - n);
                }
            }
            gap = (int) Math.ceil(gap / 2);
        }
    }

    // from editorial
    private int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    public void merge(int[] arr1,
                      int[] arr2, int n,
                      int m) {
        int i, j, gap = n + m;
        for (gap = nextGap(gap); gap > 0;
             gap = nextGap(gap)) {
            // comparing elements in the first
            // array.
            for (i = 0; i + gap < n; i++)
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }

            // comparing elements in both arrays.
            for (j = gap > n ? gap - n : 0;
                 i < n && j < m;
                 i++, j++)
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }

            if (j < m) {
                // comparing elements in the
                // second array.
                for (j = 0; j + gap < m; j++)
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
            }
        }

    }
}