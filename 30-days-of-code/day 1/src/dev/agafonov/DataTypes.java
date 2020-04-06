package dev.agafonov;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var i = 4;
            var d = 4.0;
            var s = "HackerRank ";

            var inputInt = scanner.nextLine();
            var inputDouble = scanner.nextLine();
            var inputString = scanner.nextLine();

            try {
                System.out.println(i + Integer.parseInt(inputInt));
                System.out.println(d + Double.parseDouble(inputDouble));
                System.out.print(s + inputString);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
        }
    }
}
