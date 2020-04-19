package dev.agafonov;

import java.util.Scanner;

public class Interfaces {

    public static void main(String[] args) {
        int n;
        try (var scan = new Scanner(System.in)) {
            n = scan.nextInt();
        }

        AdvancedArithmetic myCalculator = new Calculator();
        var sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
