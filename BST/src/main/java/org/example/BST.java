package org.example;

class Node{

    Node parent = null;
    Node left = null;
    Node right = null;
    int value;

    Node(int value) {
        this.value = value;
    }

    public boolean equals(Node node) {
        return this.value == node.value;
    }
}

public class BST {

    Node root;

    BST() {
        root = null;
    }

    public void insert(Node node) {
        insertRec(root, node);
    }

    private void insertRec(Node root, Node node) {

        if(root == null) {
            root = node;
            return;
        }

        if(node.value < root.value) {
            insertRec(root.left, node);
        } else if(node.value > root.value) {
            insertRec(root.right, node);
        }

    }

    public void inOrder() {
        printInOrderRec(root);
    }
    public void printInOrderRec(Node root) {

        while(root != null) {
            printInOrderRec(root.left);
            System.out.println(root.value);
            printInOrderRec(root.right);
        }
    }

}
