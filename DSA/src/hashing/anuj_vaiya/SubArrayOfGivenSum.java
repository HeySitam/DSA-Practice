package hashing.anuj_vaiya;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SubArrayOfGivenSum {
    public static void main(String[] args){
        int[] arr = {10,15,-5,15,-10,5};
        ArrayIndex idx = findSubArray(arr,5);
        System.out.println("start -> "+idx.start+" end -> "+idx.end);
    }

    private static ArrayIndex findSubArray(int arr[], int sum){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayIndex indices = new ArrayIndex();
        int currSum = 0;
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if(currSum-sum == 0){
                indices.start = 0;
                indices.end = i;
                break;
            }
            if(map.containsKey(currSum-sum)){
                indices.start = map.get(currSum-sum)+1;
                //indices.end = map.get(currSum);
                indices.end = i;
                break;
            }
            map.put(sum,i);

        }

        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        for(Map.Entry<Integer,Integer> m: set){
           System.out.println(""+m.getKey()+" -> "+m.getValue());
        }
        return indices;
    }
}

class ArrayIndex{
    int start = 0;
    int end = -1;
}
