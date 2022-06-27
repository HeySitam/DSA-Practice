package Arrays.BabbarSheet;

/**
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * Arr[] = {1,2,3,-2,5}
 * Output:
 * 9
 * Explanation:
 * Max subarray sum is 9
 * of elements (1, 2, 3, -2, 5) which
 * is a contiguous subarray.
 */
public class KadaneAlgo {
    public static void main(String[] args){
       int arr[] = {1,2,3,-2,5};
       long maxSum = new KadaneAlgoSolution().solution(arr, arr.length);
       System.out.println(maxSum);
    }
}

class KadaneAlgoSolution {

    public long solution(int arr[], int n){
        long max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i<n; i++){
            max_ending_here = max_ending_here + arr[i];

            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }

            if(max_ending_here < 0)
                max_ending_here = 0;
        }

        return max_so_far;
    }

}