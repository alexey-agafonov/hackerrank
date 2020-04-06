package dev.agafonov;

import java.util.Scanner;

public class Person {

    private int age;

    public Person(int initialAge) {
        if (initialAge > 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses() {
        ++age;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var T = scanner.nextInt();

            if (T < 1 || T > 4) {
                throw new IllegalArgumentException("T must be between 1 and 4.");
            }

            for (var i = 0; i < T; i++) {
                var age = scanner.nextInt();
                var person = new Person(age);

                person.amIOld();

                for (var j = 0; j < 3; j++) {
                    person.yearPasses();
                }

                person.amIOld();
                System.out.println();
            }
        }
    }
}
