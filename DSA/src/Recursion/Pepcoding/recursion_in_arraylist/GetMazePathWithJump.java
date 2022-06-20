package Recursion.Pepcoding.recursion_in_arraylist;

import java.util.*;

/**
 * 1. You are given a number n and a number m representing number of rows and columns in a maze.
 * 2. You are standing in the top-left corner and have to reach the bottom-right corner.
 * 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).
 * 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
 * Use sample input and output to take idea about output.
 */

public class GetMazePathWithJump {
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
        // horizontal move
        ArrayList<String> allPaths = new ArrayList<>();
        for (int ms=1; ms <= dc-sc; ms++){
            List<String> hPaths = getMazePaths(sr,sc+ms,dr,dc);
            for(String hPath : hPaths){
                allPaths.add("h"+ms+hPath);
            }
        }

        // vertical move
        for (int ms=1; ms <= dr-sr; ms++){
            List<String> vPaths = getMazePaths(sr+ms,sc,dr,dc);
            for(String vPath : vPaths){
                allPaths.add("v"+ms+vPath);
            }
        }

        //diagonal move
        for (int ms=1; ms <= dc-sc && ms <= dr-sr; ms++){
            List<String> dPaths = getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String dPath : dPaths){
                allPaths.add("d"+ms+dPath);
            }
        }
        return allPaths;
    }
}
