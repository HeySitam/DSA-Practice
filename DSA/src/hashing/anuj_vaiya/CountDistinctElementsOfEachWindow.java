package hashing.anuj_vaiya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementsOfEachWindow {
    public static void main(String[] args){
        int[] arr = {1,2,2,1,3,1,1,3};
        ArrayList<Integer> list = getAllCount(arr,4);
        System.out.println(list);
    }
    public static ArrayList<Integer> getAllCount(int[] a, int k){
        ArrayList<Integer> sizes = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        /**
         * Adding each element of the first window to the map.
         */
        for(int i = 0; i < k; i++){

            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        sizes.add(map.size());

        for(int i = k; i < a.length; i++){
            /**
             * checking if the count of the element prior to the current window
             * is 1 or >1.
             * if(cnt ==1) then remove the element
             * if(cnt > 1) then decrement the count.
             */
            if(map.get(a[i-k]) == 1){
                map.remove(a[i-k]);
            } else {
                map.put(a[i-k], map.get(i-k)-1);
            }

            /**
             * Adding the last element of the current window to the map
             */
            map.put(a[i], map.getOrDefault(a[i],0)+1);
            sizes.add(map.size());
        }

        return sizes;
    }
}
