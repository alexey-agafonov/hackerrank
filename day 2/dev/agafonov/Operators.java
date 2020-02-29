package dev.agafonov;

import java.util.Scanner;

public class Operators {

    static private final int PERCENTS = 100;

    static void solve(double mealCost, int tipPercent, int taxPercent) {
        var tip = mealCost * tipPercent / PERCENTS;
        var tax = mealCost * taxPercent / PERCENTS;
        System.out.println(Math.round(mealCost + tip + tax));
    }

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            double mealCost = scanner.nextDouble();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int tipPercent = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int taxPercent = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            solve(mealCost, tipPercent, taxPercent);
        }
    }
}
