package com.google.training.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrieTree {

    private TrieNode rootNode;

    public static void main(String[] args) {
        new TrieTree().createBinaryTree();
    }
    private void createBinaryTree() {

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print("Enter String :: ");
            String word = scanner.next();
            System.out.println("Entered data => " + word);
            createTrieTree(word);

            System.out.print("Do you want to quit (Y or N) : ");

        } while (!scanner.next().equalsIgnoreCase("y"));

    }

    private void createTrieTree(String word) {
        if( word == null || "".equalsIgnoreCase(word) ){
            return;
        }
        insertInTrieTree(word);

    }

    private void insertInTrieTree(String word) {

        TrieNode current = rootNode;
        char[] charArray = word.toCharArray();

        for( char character : charArray ){
            if( rootNode == null ){
                rootNode = new TrieNode(character);
                return;
            }



        }

    }

}

class TrieNode {

    private Map<Character, TrieNode> data;
    private boolean isWord = false;

    TrieNode(Character character) {
        data = new HashMap<>();
        data.put(character, null);
    }

    public Map<Character, TrieNode> getData() {
        return data;
    }

    public void setData(Map<Character, TrieNode> data) {
        this.data = data;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }
}
