package Arrays.BabbarSheet;

public class StockBuySell {
    static int arr[] = {3,1,4,8,7,2,5};
    public static void main(String[] args){
      int profit =   new StockBuySellSolution().optimized(arr,arr.length);
      System.out.println(profit);
    }
}

class StockBuySellSolution {


    // For only one buy and sell
    // tc - > O(n) , sc -> O(1)
    public int optimized(int arr[], int n) {
        int minSoFar = arr[0];
        int maxProfit = 0;
        int profit;
        for (int i = 1; i < n; i++) {

            if (arr[i] < minSoFar)
                minSoFar = arr[i];
            profit = arr[i] - minSoFar;
            if (profit > maxProfit)
                maxProfit = profit;
        }

        return maxProfit;
    }

    // For multiple buy and sell
    public int optimizedM(int arr[], int n){
        int profit = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]>arr[i-1])
                profit += (arr[i] - arr[i-1]);
        }
        return profit;
    }
}
