package dev.agafonov;

import java.util.Arrays;

class Student extends Person {
    private int[] scores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);

        this.scores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate() {
        int avg = Math.toIntExact(Math.round(Arrays.stream(scores)
            .average().getAsDouble()));

        if (avg >= 90 && avg <= 100) {
            return 'O';
        } else if (avg >= 80 && avg < 90) {
            return 'E';
        } else if (avg >= 70 && avg < 80) {
            return 'A';
        } else if (avg >= 55 && avg < 70) {
            return 'P';
        } else if (avg >= 40 && avg < 55) {
            return 'D';
        } else if (avg < 40) {
            return 'T';
        }
        return '1';
    }
}
