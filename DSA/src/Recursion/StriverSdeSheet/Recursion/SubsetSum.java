package Recursion.StriverSdeSheet.Recursion;

import java.util.*;

/**
 * You are given an array of ‘N’ integers. You have to find the sum of all the subsets in the non-decreasing order of the given array.
 * For Example
 * If N=3 and array elements are [1,2].
 * Following are the subset sums:
 * 0 (by considering empty subset)
 * 1
 * 2
 * 1+2 = 3
 * So, subset sum are [0,1,2,3].
 */

public class SubsetSum {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        n.add(3);
        n.add(1);
        n.add(2);
        ArrayList<Integer> ssList = new OptimalSolution().subsetSums(n, 3);
        System.out.print(ssList);
    }
}

 // two approach are same here
class MySolution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> rList = unsortedSubsetSums(arr,N);
        Collections.sort(rList);
        return rList;

    }

    ArrayList<Integer> unsortedSubsetSums(ArrayList<Integer> arr, int N){
        if(N == 0){
            ArrayList<Integer> slist = new ArrayList<>();
            slist.add(0);
            return slist;
        }

        int t1 = arr.get(0);
        ArrayList<Integer> roa = new ArrayList<>();
        for (int i=1; i< N; i++ ){
            roa.add(arr.get(i)) ;
        }

        List<Integer> fSumList = unsortedSubsetSums(roa, roa.size());
        ArrayList<Integer> resList = new ArrayList<>();
        for (int fSum: fSumList){
            resList.add(fSum);
            resList.add(fSum+t1);
        }
        return resList;
    }
}

class OptimalSolution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> rList = new ArrayList<>();
        unsortedSubsetSums(0,0,arr,N,rList);
        Collections.sort(rList);
        return rList;

    }

    void unsortedSubsetSums(int idx, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> subSetSum){
        if(idx == N){
            subSetSum.add(sum);
            return;
        }

        // choosing 1st item
        unsortedSubsetSums(idx+1,sum+arr.get(idx),arr,N,subSetSum);

        // not choosing 1st item
        unsortedSubsetSums(idx+1,sum,arr,N,subSetSum);
    }
}