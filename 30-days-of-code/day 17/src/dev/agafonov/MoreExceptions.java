package dev.agafonov;

import java.util.Scanner;

public class MoreExceptions {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var iterations = scanner.nextInt();

            while (iterations-- > 0) {
                var n = scanner.nextInt();
                var p = scanner.nextInt();

                Calculator myCalculator = new Calculator();
                try {
                    int ans = myCalculator.power(n, p);
                    System.out.println(ans);
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
