package dev.agafonov;

import java.util.Scanner;

public class BitwiseAnd {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var testsCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (var i = 0; i < testsCount; i++) {
                var nk = scanner.nextLine().split(" ");
                var n = Integer.parseInt(nk[0]);
                var k = Integer.parseInt(nk[1]);

                System.out.println(findMax(n, k));
            }
        }
    }

    private static int findMax(int n, int k) {
        var max = 0;
        for (var a = 1; a < n; a++) {
            for (var b = a + 1; b <= n; b++) {
                var tmp = a & b;
                if (tmp > max && tmp < k) max = tmp;
            }
        }
        
        return max;
    }
}