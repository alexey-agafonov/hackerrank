package dev.agafonov;

import java.util.Scanner;

public class NestedLogic {

    public static void main(String[] args) {
        int actuallyReturnedDay;
        int actuallyReturnedMonth;
        int actuallyReturnedYear;
        int expectedReturnedDay;
        int expectedReturnedMonth;
        int expectedReturnedYear;

        try (var scanner = new Scanner(System.in)) {
            actuallyReturnedDay = scanner.nextInt();
            actuallyReturnedMonth = scanner.nextInt();
            actuallyReturnedYear = scanner.nextInt();
            expectedReturnedDay = scanner.nextInt();
            expectedReturnedMonth = scanner.nextInt();
            expectedReturnedYear = scanner.nextInt();
        }

        int fine = 0;

        if (actuallyReturnedYear == expectedReturnedYear &&
            actuallyReturnedMonth == expectedReturnedMonth) {
            if (actuallyReturnedDay > expectedReturnedDay)
                fine = 15 * (actuallyReturnedDay - expectedReturnedDay);
            else
                fine = 0;
        } else if (actuallyReturnedYear == expectedReturnedYear) {
            if (actuallyReturnedMonth > expectedReturnedMonth)
                fine = 500 * (actuallyReturnedMonth - expectedReturnedMonth);
            else
                fine = 0;
        } else if (actuallyReturnedYear > expectedReturnedYear)
            fine = 10000;

        System.out.println(fine);
    }
}