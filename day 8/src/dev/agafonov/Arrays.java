package dev.agafonov;

import java.util.HashMap;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var n = scanner.nextInt();

            if (n < 1 || n > Math.pow(10, 5)) {
                throw new IllegalArgumentException("n must be from 1 to 10^5");
            }

            var phoneBook = new HashMap<String, Integer>();
            for (var i = 0; i < n; i++) {
                var name = scanner.next();
                var phone = scanner.nextInt();
                phoneBook.put(name, phone);
            }

            while (scanner.hasNext()) {
                var s = scanner.next();

                if (phoneBook.containsKey(s)) {
                    System.out.println(s + "=" + phoneBook.get(s));
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }
}
