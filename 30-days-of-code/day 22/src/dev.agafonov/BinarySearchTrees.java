package dev.agafonov;

import java.util.Scanner;

public class BinarySearchTrees {

    public static int getHeight(Node root) {
        return maxDepth(root) - 1;
    }

    private static int maxDepth(Node root) {
        if (root != null) {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        } else {
            return 0;
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

            var height = getHeight(root);
            System.out.println(height);
        }
    }
}