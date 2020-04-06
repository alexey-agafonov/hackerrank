package dev.agafonov;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Review {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var T = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (T < 1 || T > 10) {
                throw new IllegalArgumentException("T must be from 1 to 10.");
            }

            var strings = new ArrayList<String>();
            for (var i = 0; i < T; i++) {
                var string = scanner.nextLine();

                if (string.length() < 2 || string.length() > 10000) {
                    System.out.println("Input text length must be from 2 to 10000.");
                    continue;
                }

                strings.add(string);
            }

            for (var string : strings) {
                IntStream.range(0, string.length())
                    .filter(j -> j % 2 == 0)
                    .forEach(j -> System.out.print(string.charAt(j)));
                System.out.print(" ");
                
                IntStream.range(0, string.length())
                    .filter(j -> j % 2 != 0)
                    .forEach(j -> System.out.print(string.charAt(j)));
                System.out.println();
            }
        }
    }
}
