package com.google.training.graph;

import java.util.Stack;

public class DFSGraph {
    public static void main(String[] args) {
        int row = 3,column = 3;
        int[][] matrix = new int[row][column];
//        int[][] visited =
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        matrix[1][2] = 1;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;

        new DFSGraph().dfsSearch(matrix, row, column);
    }

    private void dfsSearch(int[][] matrix, int row, int column) {
        Stack<Integer> integerStack = new Stack<>();


    }
}
