package com.google.training.tree;

import java.util.LinkedList;
import java.util.Queue;
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

        System.out.print("Inorder traversal :: ");
        printInOrderTraversal(rootNode);
        System.out.println();
        System.out.print("Postorder traversal :: ");
        printPostOrderTraversal(rootNode);
        System.out.println();
        System.out.print("Preorder traversal :: ");
        printPreOrderTraversal(rootNode);
        System.out.println();
        System.out.print("LevelOrder traversal :: ");
        printLevelOrderTraversal( new LinkedList<>());

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

    private void printLevelOrderTraversal(Queue<Node> queue) {

        if(rootNode == null) {
            return;
        }
        queue.add(rootNode);

        while( !queue.isEmpty() ){
            Node node = queue.remove();
            System.out.print(" "+node.getData());
            if( node.getLeftNode()!=null ) queue.add(node.getLeftNode());
            if( node.getRightNode()!=null ) queue.add(node.getRightNode());
        }


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
