package Recursion.Pepcoding;

import java.util.Scanner;

/**
 * 1. Here are a few sets of inputs and outputs for your reference
 * Input1 -> 1
 * Output1 -> 1 1 1
 *
 * Input2 -> 2
 * Output2 -> 2 1 1 1 2 1 1 1 2
 *
 * Input2 -> 3
 * Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
 *
 * 2. Figure out the pattern and complete the recursive function pzz to achieve the above for any positive number n.
 *
 * Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
 * Write recursive and not iterative logic.
 * The purpose of the question is to aid learning recursion and not test you.
 */
public class PrintZigZag {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n) {
        if (n == 0) return;
        System.out.print(n+" "); // printing pre position
        pzz(n - 1);
        System.out.print(n+" "); // printing in position
        pzz(n - 1);
        System.out.print(n+" "); // printing post position

    }

}
