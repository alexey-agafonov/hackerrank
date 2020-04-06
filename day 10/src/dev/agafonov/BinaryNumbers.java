package dev.agafonov;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (n < 1 || n > Math.pow(10, 6)) {
                throw new IllegalArgumentException("A number of elements of an array must be from 1 to 1000.");
            }

            System.out.println(getConsecutiveNumber(getBinaryRepresentation(n)));
        }
    }

    private static ArrayList<Integer> getBinaryRepresentation(int number) {
        var list = new ArrayList<Integer>();

        while (number > 1) {
            list.add(0, number % 2);
            number /= 2;
        }
        list.add(0, number);

        return list;
    }

    private static int getConsecutiveNumber(ArrayList<Integer> binaryNumber) {
        var max = 0;
        var equals = 0;
        var previous = binaryNumber.get(0);

        for (var i = 0; i < binaryNumber.size(); i++) {
            if (previous == 1 && previous.equals(binaryNumber.get(i))) {
                previous = binaryNumber.get(i);
                ++equals;
            } else {
                equals = 0;
            }

            if (equals > max) max = equals;
        }

        return max;
    }
}
