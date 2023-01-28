package org.example;

class Node{

    String val;
    Node next = null;

    Node(String val) {
        this.val = val;
    }

    public boolean equals(Node node) {
        return this.val.equals(node.val);
    }

}

class LinkedList {

    Node root;
    Node lastNode;

    LinkedList() {
        root = new Node("");
        lastNode = root;
    }

    public void addNode(Node node) {
        lastNode.next = node;
        lastNode = node;
    }

    public void deleteFirstFoundNode(Node node) {
        Node temp = root;

        while(temp.next != null) {

            if(temp.next.equals(node)) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    public void deleteAllFoundNodes(Node node) {
        Node temp = root;

        while(temp.next != null) {

            if(temp.next.equals(node)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public void print() {
        Node temp = root;

        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.addNode(new Node("2"));
        linkedList.addNode(new Node("2"));
        linkedList.addNode(new Node("2"));
        linkedList.addNode(new Node("2"));
        linkedList.addNode(new Node("2"));

        linkedList.print();

        linkedList.deleteFirstFoundNode(new Node("2"));
        linkedList.print();

        linkedList.addNode(new Node("2"));
        linkedList.addNode(new Node("2"));
        linkedList.deleteAllFoundNodes(new Node("2"));
        linkedList.print();



    }
}