package dev.agafonov;

import java.util.Scanner;

class LinkedList {

    public static Node insert(Node head,int data) {
        var node = new Node(data);
        
        if (head == null) {
            head = node;
            return head;
        }

        var temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

        return head;
    }

    public static void display(Node head) {
        Node start = head;

        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        try(var sc = new Scanner(System.in)) {
            Node head = null;
            int count = sc.nextInt();

            while (count-- > 0) {
                int element = sc.nextInt();
                head = insert(head, element);
            }

            display(head);
        }
    }
}