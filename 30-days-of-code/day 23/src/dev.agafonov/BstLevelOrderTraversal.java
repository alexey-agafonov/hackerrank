package dev.agafonov;

import java.util.ArrayDeque;
import java.util.Scanner;

class BstLevelOrderTraversal {

    private static final ArrayDeque<Node> queue = new ArrayDeque<>();

    private static void levelOrder(Node root) {
        if (root != null) {
            queue.add(root);

            while (!queue.isEmpty()) {
                Node tmp = queue.pop();

                System.out.print(tmp.data + " ");

                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }

            return root;
        }
    }

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {

            var nodesNumber = scanner.nextInt();
            Node root = null;
            while (nodesNumber-- > 0) {
                var data = scanner.nextInt();
                root = insert(root, data);
            }

            levelOrder(root);
        }
    }
}