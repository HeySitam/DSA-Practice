package Recursion.Pepcoding.recursion_in_arraylist;

import java.util.*;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ssList = getStairPaths(n);
        System.out.print(ssList);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> sList = new ArrayList<>();
            sList.add("");
            return sList;
        } else if(n < 0){
            ArrayList<String> sList = new ArrayList<>();
            return sList;
        }
        List<String> p1Steps = getStairPaths(n-1);
        List<String> p2Steps = getStairPaths(n-2);
        List<String> p3Steps = getStairPaths(n-3);
        ArrayList<String> resList = new ArrayList<>();

        for(String path: p1Steps){
            resList.add("1"+path);
        }
        for(String path: p2Steps){
            resList.add("2"+path);
        }
        for(String path: p3Steps){
            resList.add("3"+path);
        }
        return resList;

    }
}
