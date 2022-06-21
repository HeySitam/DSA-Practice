package Recursion.Pepcoding.recursion_on_the_way_up;

import java.util.Scanner;

/**
 * 1. You are given a string str.
 * 2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
 * Use sample input and output to take idea about subsequences.
 */
public class PrintSubsequence {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSS(str,"");

    }

    public static void printSS(String str, String ans) {

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        printSS(ros,ans+ch);
        printSS(ros,ans+"");

    }
}
