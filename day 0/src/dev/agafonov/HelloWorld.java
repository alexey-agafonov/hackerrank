package dev.agafonov;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var inputString = scanner.nextLine();

            System.out.printf("Hello, World.\n%s", inputString);
        }
    }
}
