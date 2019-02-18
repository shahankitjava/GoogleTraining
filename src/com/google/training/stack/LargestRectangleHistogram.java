package com.google.training.stack;

import java.util.Stack;

public class LargestRectangleHistogram {

    public static void main(String[] args) {
        int[] arr = new int[]{6, 2, 5, 4, 5, 1, 6};
        findHighestReactangle(arr);
    }

    private static void findHighestReactangle(int[] arr) {

        Stack<Integer> histStack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (histStack.isEmpty() || arr[i] >= histStack.peek()) {
                histStack.push(arr[i]);
            } else {
                while (histStack.peek() < arr[i]) {
                    histStack.pop();
                }
            }

        }

        System.out.println(histStack);

    }

}
// 6,
