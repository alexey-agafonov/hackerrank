package dev.agafonov;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

    public void printData() {
        System.out.println(next);
    }
}
