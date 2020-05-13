package dev.agafonov;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternsIntroToDatabases {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var number = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            var people = new ArrayList<String>();
            var emailPattern = Pattern.compile("[a-z@.]@gmail.com${1,50}");
            Matcher matcher;
            for (var i = 0; i < number; i++) {
                var firstNameEmailID = scanner.nextLine().split(" ");
                var firstName = firstNameEmailID[0];
                var emailID = firstNameEmailID[1];

                matcher = emailPattern.matcher(emailID);
                if (matcher.find()) {
                    people.add(firstName);
                }
            }

            Collections.sort(people);
            people.forEach(System.out::println);
        }
    }
}