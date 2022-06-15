package Recursion.Pepcoding;

import java.util.Scanner;

public class PowerLinear {
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
        int res = x * power(x, n - 1);
        return res;
    }
}
