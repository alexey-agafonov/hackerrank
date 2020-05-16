package dev.agafonov;

import java.util.Scanner;

public class RunningTimeComplexity {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var testsCount = scanner.nextInt();

            int number;
            for (var i = 0; i < testsCount; i++) {
                number = scanner.nextInt();

                if (isPrime(number)) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n == 1 || n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; ) {
            if (n % i == 0) {
                return false;
            }
            i += 2;
        }
        return true;
    }
}