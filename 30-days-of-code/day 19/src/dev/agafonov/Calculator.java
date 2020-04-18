package dev.agafonov;

import java.util.stream.IntStream;

public class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {

        return IntStream.rangeClosed(1, n)
            .filter(x -> n % x == 0)
            .sum();
    }
}