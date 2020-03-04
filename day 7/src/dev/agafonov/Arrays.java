package dev.agafonov;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HelloWorld {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (n < 1 || n > 1000) {
                throw new IllegalArgumentException("A number of elements of an array must be from 1 to 1000.");
            }

            var arr = new int[n];

            var arrItems = scanner.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            var list = Arrays.stream(arr)
                            .boxed()
                            .collect(Collectors.toList());
            Collections.reverse(list);
            list.forEach(item -> System.out.print(item + " "));
        }
    }
}
