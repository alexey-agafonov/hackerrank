package dev.agafonov;

import java.util.ArrayList;

public class Printer <T> {

    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param arr generic array
     **/
    void printArray(T[] arr) {
        for (var item : arr) {
            System.out.println(item);
        }
    }
}
