package Recursion.Pepcoding;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        int fact = n * factorial(n - 1);
        return fact;
    }
}
