package Arrays.BabbarSheet;

import java.util.*;

public class NextPermutation {
}

class NextPermutationSolution {
    static List<Integer> nextPermutation(int n, int arr[]){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int idx1 = -1, idx2 = -1;
        for (int i = n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                idx1 = i;
                break;
            }
        }

        if(idx1 != -1) {
            for (int i = n-1; i>=0; i--){
                if(arr[i] > arr[idx1]){
                    idx2 = i;
                    break;
                }
            }


            swap(arr, idx1, idx2);
        }
        reverseArray(arr, n, idx1+1);


        addToList(list, arr);
        return list;

    }
    static void addToList(ArrayList<Integer> list, int arr[]){
        for(int i = 0; i< arr.length; i++){
            list.add(arr[i]);
        }
    }

    static void reverseArray(int arr[], int n, int start){

        int end = n-1;
        while(start<end){
            swap(arr,start,end);
            start ++;
            end --;
        }

    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
