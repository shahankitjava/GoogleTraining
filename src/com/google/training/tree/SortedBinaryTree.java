package com.google.training.tree;

import java.util.Scanner;

public class SortedBinaryTree {

    private Node rootNode;

    public static void main(String[] args) {
        new SortedBinaryTree().createBinaryTree();
    }

    private void createBinaryTree() {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter element :: ");
            int data = scanner.nextInt();
            System.out.println("Entered data => " + data);

            insertNode(rootNode, data);

            System.out.print("Do you want to quit (Y or N) : ");

        } while (!scanner.next().equalsIgnoreCase("y"));

        printInOrderTraversal(rootNode);
        System.out.println();
        printPostOrderTraversal(rootNode);
        System.out.println();
        printPreOrderTraversal(rootNode);

    }



    private Node insertNode(Node currentNode, int data) {
        if( rootNode == null ){
            this.rootNode = new Node(data);
            return rootNode;
        }

        if( currentNode == null ){
            return new Node(data);
        }

        if( data < currentNode.getData() ){
            currentNode.setLeftNode(insertNode(currentNode.getLeftNode(), data));
        }else{
            currentNode.setRightNode(insertNode(currentNode.getRightNode(), data));
        }
        return currentNode;
    }

    private void printPreOrderTraversal(Node node) {
        if(node == null){
            return;
        }
        System.out.print(" "+node.getData());
        printPreOrderTraversal(node.getLeftNode());
        printPreOrderTraversal(node.getRightNode());
    }

    private void printInOrderTraversal(Node node) {
        if( node == null ){
            return ;
        }

        printInOrderTraversal(node.getLeftNode());
        System.out.print(" " + node.getData());
        printInOrderTraversal(node.getRightNode());
    }

    private void printPostOrderTraversal(Node node) {
        if(node == null){
            return;
        }
        printPostOrderTraversal(node.getLeftNode());
        printPostOrderTraversal(node.getRightNode());
        System.out.print(" "+node.getData());
    }

}

class Node {

    private int data;
    private Node leftNode;
    private Node rightNode;

    public Node(int data){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
