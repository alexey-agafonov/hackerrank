package dev.agafonov;

import java.util.Scanner;

public class Sorting {
    static void swap(int[] arr, int i, int j) {
        final var tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int n;
        int[] a;
        try (var in = new Scanner(System.in)) {
            n = in.nextInt();
            a = new int[n];
            for (var i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
        }

        var numberOfAllSwaps = 0;
        for (var i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            var numberOfLocalSwaps = 0;

            for (var j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    numberOfLocalSwaps++;
                }
            }

            if (numberOfLocalSwaps == 0) {
                break;
            }

            numberOfAllSwaps += numberOfLocalSwaps;
        }

        System.out.println("Array is sorted in " + numberOfAllSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}
