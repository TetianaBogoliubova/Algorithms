package org.example.homework_23_11_21;

import java.util.ArrayDeque;
import java.util.Queue;

public class SearchTree {

    private class Node {
        private String key;
        private Integer value;
        private Node left;
        private Node right;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public SearchTree() {
        root = null;
    }

    public int treeHeight1() {
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int height = 0;
        while (!queue.isEmpty()) {
            int nodesInCurrentLevel = queue.size();

            for (int i = 0; i < nodesInCurrentLevel; i++) {
                Node current = queue.remove();
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            height++;
        }
        return height;
    }

    public int treeHeight2() {// рекурсия
        return calculateHeight(root);
    }

    private int calculateHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public void add(String key, Integer value) {
        root = add(root, key, value);
    }

    private Node add(Node node, String key, Integer value) {
        if (node == null) return new Node(key, value); // base condition

        if (key.compareTo(node.key) == 0) {
            node.value = value;
            return node;
        }
        if (key.compareTo(node.key) < 0) node.left = add(node.left, key, value);
        if (key.compareTo(node.key) > 0) node.right = add(node.right, key, value);
        return node;
    }

    public static void main(String[] args) {
        SearchTree tree = new SearchTree();
        tree.add("C", 10);
        tree.add("A", 5);
        tree.add("B", 2);
        tree.add("F", 100);
        tree.add("K", 100);
        tree.add("X", 100);

        System.out.println("Height - " + tree.treeHeight1());
        System.out.println("Height - " + tree.treeHeight2());
    }
}

