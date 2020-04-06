package dev.agafonov;

import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {
        try (var scan = new Scanner(System.in)) {
            var firstName = scan.next();
            var lastName = scan.next();
            var id = scan.nextInt();
            var numScores = scan.nextInt();
            var testScores = new int[numScores];

            for (int i = 0; i < numScores; i++) {
                testScores[i] = scan.nextInt();
            }

            var s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate());
        }
    }
}