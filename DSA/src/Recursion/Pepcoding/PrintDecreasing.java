package Recursion.Pepcoding;

import java.util.Scanner;

/**
 * 1. You are given a positive number n.
 * 2. You are required to print the counting from n to 1.
 * 3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.
 */

public class PrintDecreasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n==0) return;
        System.out.println(n);
        printDecreasing(n-1);

    }
}
