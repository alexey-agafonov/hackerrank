package dev.agafonov;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (n >= 1 && n <= 100) {
                if (n % 2 != 0) {
                    System.out.println("Weird");
                } else if (n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                } else if (n >= 6 && n <= 20) {
                    System.out.println("Weird");
                } else if (n >= 20) {
                    System.out.println("Not Weird");
                }
            }
        }
    }
}