package BabbarSheet.arrays;

import java.util.*;

public class KthSL {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter K th number :");
        int k = sc.nextInt();
        int kthMin = getKthMin(arr,k);
        System.out.println(""+ k+" th min is "+ kthMin);
    }

    private static int myApproach(int []arr, int k){
        Arrays.sort(arr);
        return arr[k-1];

        /**
         * TC -> depends on the sorting algo used
         */
    }
}
