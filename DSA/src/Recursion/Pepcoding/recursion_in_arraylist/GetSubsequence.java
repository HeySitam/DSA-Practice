package Recursion.Pepcoding.recursion_in_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. You are given a string str.
 * 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
 * Use sample input and output to take idea about subsequences.
 */
public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> ssList = gss(str);
        System.out.print(ssList);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> ss = new ArrayList<>();
            ss.add("");
            return ss;
        }
        char firstChar = str.charAt(0);
        ArrayList<String> newList = gss(str.substring(1));
        ArrayList<String> resList = new ArrayList<>();
        for (String sp : newList) {
          //  if (!sp.isEmpty())
                resList.add(""+sp);
        }
        for (String sp : newList) {
            resList.add(firstChar + sp);
        }
        return resList;
    }
}
