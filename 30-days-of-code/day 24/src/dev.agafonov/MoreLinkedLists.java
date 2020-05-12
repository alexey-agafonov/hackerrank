package dev.agafonov;

import java.util.HashSet;
import java.util.Scanner;

class MoreLinkedLists {

    public static Node removeDuplicates(Node head) {
        var unique = new HashSet<Integer>();
        var tmp = head;

        while (head.next != null) {
            unique.add(head.data);

            if (unique.contains(head.next.data)) {
                head.next = head.next.next;
                continue;
            }

            head = head.next;
        }

        return tmp;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();

        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }

        removeDuplicates(head);
        display(head);
    }
}