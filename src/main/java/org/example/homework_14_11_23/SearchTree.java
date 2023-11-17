package org.example.homework_14_11_23;

import java.util.LinkedList;
import java.util.Queue;

public class SearchTree {
    private class Node {
        private String key;
        private Integer value;

        //        List<Node> nodes;
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

    //В двоичном дереве поиска SearchTree (см. код в репозитории) реализовать метод public String getMaxKey(),
    // который возвращал бы наибольший ключ, находящийся в дереве.
    public String getMaxKey() {
        Node tmp = root;
        while (tmp.right != null) {
            tmp = tmp.right;
        }
        return tmp.key;
    }

    public Integer find(String key) { // compareTo() must be consistent with equals()
        Node tmp = root;
        while (tmp != null) {
            if (key.compareTo(tmp.key) == 0) return tmp.value;
            else if (key.compareTo(tmp.key) < 0) tmp = tmp.left;
            else if (key.compareTo(tmp.key) > 0) tmp = tmp.right;
        }
        return null;
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

    public Iterable<String> getKeys() {
        Queue<String> queue = new LinkedList<>();
        inorder(queue, root);
        return queue;
    }

    private void inorder(Queue<String> queue, Node node) {
        if (node == null) return; // base condition
        inorder(queue, node.left);
        queue.add(node.key);
        inorder(queue, node.right);
    }

    public static void main(String[] args) {
        SearchTree tree = new SearchTree();
        tree.add("C", 10);
        tree.add("A", 5);
        tree.add("B", 2);
        tree.add("F", 100);
        tree.add("K", 100);
        tree.add("X", 100);

        System.out.println(tree.find("A"));
        System.out.println(tree.find("B"));
        System.out.println(tree.find("C"));
        System.out.println(tree.find("D"));
        System.out.println(tree.getKeys());

        System.out.println("Max key: " + tree.getMaxKey());
    }
}
