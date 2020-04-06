package dev.agafonov;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Loops {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var n = scanner.nextInt();

            if (n < 2 || n > 20) {
                throw new IllegalArgumentException("n must be between 2 and 20.");
            }

            IntStream
                .rangeClosed(1, 10)
                .forEach(i -> {
                    System.out.printf("%d x %d = %d\n", n, i, n * i);
                });
        }
    }
}
