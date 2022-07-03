package Arrays.BabbarSheet;

import java.util.HashMap;

public class CountPairWithGivenSum {
    public static void main(String[] args){
        int arr[] = {10, 15, -5, 15, -10, 5};
        int cnt = new CountPairWithGivenSumSolution().optimized(arr, arr.length, 6);
        System.out.println(cnt);
    }
}

class CountPairWithGivenSumSolution {
    public int optimized(int[] arr, int n, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        int currentSum = 0;
        for(int i = 0; i<n ; i++){
            currentSum += arr[i];
            int checkDiff = currentSum-k;
            if(checkDiff == 0)
                cnt++;
            if(map.containsKey(checkDiff)){
                cnt ++;
                break;
            }
            map.put(currentSum, i);
        }
        System.out.println(map);
        return cnt;
    }
}
