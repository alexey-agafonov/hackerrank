package dev.agafonov;

class Difference {
    public int maximumDifference;
    private int[] elements;

    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (var element : elements) {
            if (element < min) {
                min = element;
            }

            if (element > max) {
                max = element;
            }
        }

        this.maximumDifference = Math.abs(max - min);
    }
}
