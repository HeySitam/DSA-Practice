package Recursion.Pepcoding;

import java.util.Scanner;

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
