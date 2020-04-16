package dev.agafonov;

import java.util.*;

public class QueuesAndStacks {

    private final Stack<Character> stack = new Stack<>();
    private final Queue<Character> queue = new LinkedList<>();

    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.remove();
    }

    public static void main(String[] args) {
        String input;
        try (var scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
        }

        var str = input.toCharArray();

        var p = new QueuesAndStacks();

        for (char ch : str) {
            p.pushCharacter(ch);
            p.enqueueCharacter(ch);
        }

        var isPalindrome = true;
        for (var i = 0; i < str.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word, " + input + ", is "
            + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
