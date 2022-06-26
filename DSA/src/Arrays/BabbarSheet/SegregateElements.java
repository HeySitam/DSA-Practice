package Arrays.BabbarSheet;

import java.util.*;

public class SegregateElements {

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        new Solution().byChangingOrderDNF(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

class Solution {
    /**
     * T.C -> O(N)
     * S.C -> O(N)
     */
    // Segregate Elements
    public void withoutChangingOrder(int arr[], int n) {
        // Your code goes here
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                list.add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0)
                list.add(arr[i]);
        }

        int i = 0;
        for (int item : list) {
            arr[i] = item;
            i++;
        }
    }

    // Two pointer approach
    public void byChangingOrderTP(int arr[], int n) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0) left++;
            else if ((arr[left] > 0 && arr[right] < 0)) {
                swap(arr, left, right);
                left++;
                right--;
            } else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            }
        }
    }

    public void byChangingOrderDNF(int arr[], int n) {
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
          if(arr[lo] < 0)
              lo ++;
          else {
              swap(arr, hi, lo);
              hi--;
          }
        }
    }

    public void swap(int a[], int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
