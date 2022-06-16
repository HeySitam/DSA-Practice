package Recursion.Pepcoding.introduction_to_recursion;

import java.util.Scanner;

/**
 * 1. You are given a number x.
 * 2. You are given another number n.
 * 3. You are required to calculate x raised to the power n. Don't change the signature of power function.
 *
 * Note1 -> The previous version expects the call stack to be of n height. This function expects call function to be only log(n) high.
 *
 * Note2 -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
 * Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
 */
public class PowerLogarithmic {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int res = power(x, n);
        System.out.println(res);
    }

    public static int power(int x, int n) {
        if (n == 0) return 1;
        int faithValue = power(x, n / 2);
        int value = faithValue * faithValue;

        if (n % 2 == 1) value *= x;
        return value;
    }
}
