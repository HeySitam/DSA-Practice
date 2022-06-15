package Recursion.Pepcoding;

import java.util.Scanner;

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
