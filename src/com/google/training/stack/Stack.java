package com.google.training.stack;

import java.util.Scanner;

public class Stack {

    private final static int[] stack = new int[10];
    private static int index = -1;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter P for Push");
        System.out.println("Enter V for Peek");
        System.out.println("Enter D for Pop");
        System.out.println("Enter Q for Quit");

        String operation = null;


        while(true){
            System.out.print("Enter operation :: ");
            operation = in.next();
            if(operation.equalsIgnoreCase("q")) {
                System.out.println("Exiting...");
                break;
            }

            switch (operation.toLowerCase()){
                case "p":
                    System.out.print("Enter the element :: ");
                    pushInStack(stack, in.nextInt());
                    break;
                case "d":
                    popFromStack(stack);
                    break;
                case "v":
                    peekFromStack(stack);
                    break;

            }
        }


    }

    private static void peekFromStack(int[] stack) {
        if(index < 0){
            System.out.println("Stack is empty, cannot peek elements");
            System.out.println();
            return;
        }
        System.out.println("View element :: "+ stack[index]);
        System.out.println();
    }

    private static void popFromStack(int[] stack) {
        if(index < 0){
            System.out.println("Stack is empty, cannot pop elements");
            System.out.println();
            return;
        }
        System.out.println("Deleted element :: "+ stack[index]);
        System.out.println();
        index--;
    }

    private static void pushInStack(int[] integerStack, int element) {
        if(  index == (integerStack.length-1)  ){
            System.out.println("Stack is full, cannot push elements");
            return;
        }
        System.out.println("Inserted element :: "+ element);
        System.out.println();
        integerStack[++index] = element;
    }

}
