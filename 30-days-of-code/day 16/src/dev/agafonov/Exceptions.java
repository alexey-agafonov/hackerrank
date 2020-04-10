package dev.agafonov;

import java.util.Scanner;

class Exceptions {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var value = scanner.next();

            try {
                System.out.println(Integer.parseInt(value));
            } catch (NumberFormatException ex) {
                System.out.println("Bad String");
            }
        }
    }
}