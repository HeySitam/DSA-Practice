package Arrays.BabbarSheet;

import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args){
        int[] arr = {3,7,9,0,2,3,5,2};
        List<Integer> list = new FindDuplicatesInArraySolution().bruteForce(arr,arr.length);
        System.out.println(list);
    }
}

class FindDuplicatesInArraySolution{

    // T.C -> O(n^2 + mlogm) or O(n^2)
    public  ArrayList<Integer> bruteForce(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    if(!list.contains(arr[i]))
                        list.add(arr[i]);
                }
            }
        }

        if(list.isEmpty()){
            list.add(-1);
        }
        // code here
        Collections.sort(list);

        return list;
    }

    // TC -> O(n) and SC-> O(1)
    public  ArrayList<Integer> optimized(int arr[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n ; i++){
            arr[arr[i]%n] += n;
        }

        for(int i = 0; i<n ; i++){
            if (arr[i] >= n*2)
                list.add(i);
        }

        if(list.isEmpty()) list.add(-1);

        return list;
    }
}