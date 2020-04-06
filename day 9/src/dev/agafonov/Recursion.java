package dev.agafonov;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            System.out.println(factorial(n));
        }
    }

    static int factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : 1;
    }
}
