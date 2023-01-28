package org.example;

public class Main {
    public static void main(String[] args) {

        BST bst = new BST();

        bst.insert(new Node(50));
        bst.insert(new Node(30));
        bst.insert(new Node(20));
        bst.insert(new Node(40));
        bst.insert(new Node(70));
        bst.insert(new Node(60));
        bst.insert(new Node(80));

        bst.inOrder();
    }
}