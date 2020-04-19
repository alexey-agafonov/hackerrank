package dev.agafonov;

import java.util.Scanner;

public class Generics {

    public static void main(String args[]){
        Integer[] intArray;
        String[] stringArray;
        try (var scanner = new Scanner(System.in)) {
            var n = scanner.nextInt();
            intArray = new Integer[n];
            for (var i = 0; i < n; i++) {
                intArray[i] = scanner.nextInt();
            }

            n = scanner.nextInt();
            stringArray = new String[n];
            for (var i = 0; i < n; i++) {
                stringArray[i] = scanner.next();
            }
        }

        var intPrinter = new Printer<Integer>();
        var stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}