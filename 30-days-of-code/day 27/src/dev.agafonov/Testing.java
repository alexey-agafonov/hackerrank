package dev.agafonov;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Testing {

    public static int minimumIndex(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int minIdx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[minIdx]) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    static class TestDataEmptyArray {
        public static int[] getArray() {
            return new int[0];
        }
    }

    static class TestDataUniqueValues {
        public static int[] getArray() {
            return new int[] {13, 8, 26, 2, 17, 20, 1};
        }

        public static int getExpectedResult() {
            return 6;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] getArray() {
            return new int[] {13, 1, 1, 7, 10, 144};
        }

        public static int getExpectedResult() {
            return 1;
        }
    }


    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.getArray();
            int result = minimumIndex(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.getArray();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.getExpectedResult();
        int result = minimumIndex(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.getArray();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expectedResult = TestDataExactlyTwoDifferentMinimums.getExpectedResult();
        int result = minimumIndex(seq);
        if (result != expectedResult) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}