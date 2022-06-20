package Recursion.Pepcoding.recursion_in_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
 * 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
 * 3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
 * Use sample input and output to take idea about output.
 */
public class GetMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ssList = getMazePaths(1,1,n,m);
        System.out.print(ssList);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // Base case
        if(sr == dr && sc == dc) {
            ArrayList<String> sList = new ArrayList<>();
            sList.add("");
            return sList;
        }
        if(sr>dr || sc>dc){
            ArrayList<String> sList = new ArrayList<>();
            return sList;
        }

        // F -> E
        List<String> mPathsH = new ArrayList<>();
        List<String> mPathsV = new ArrayList<>();
        if(sc < dc)
         mPathsH = getMazePaths(sr,sc+1,dr,dc);
        if(sr < dr)
         mPathsV = getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> resList = new ArrayList<>();
        for(String path: mPathsH){
            resList.add("h"+path);
        }
        for(String path: mPathsV){
            resList.add("v"+path);
        }
        return resList;
    }
}
