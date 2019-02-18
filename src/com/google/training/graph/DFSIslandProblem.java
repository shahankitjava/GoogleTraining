package com.google.training.graph;

public class DFSIslandProblem {
    public static void main(String[] args) {
        int[][] matrix = prepareMatrixData();
        findBiggestIsland(matrix, 6, 7);
    }

    private static void findBiggestIsland(int[][] matrix, int row, int column) {

        if( row <=0 || column <= 0 ){
            return;
        }

        int maxIslandSize = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if( matrix[i][j]==1){
                    int size = dfsSearch( matrix, i, j );
                    maxIslandSize = Math.max(size, maxIslandSize);
                }
            }
        }
        System.out.println("Island Size :: "+maxIslandSize);

    }

    private static int dfsSearch(int[][] matrix, int row, int column) {

        int size = 1;

        if( row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length ){
            return 0;
        }

        if( matrix[row][column] == 0){
            return 0;
        }
        matrix[row][column]=0;
        for( int r = row-1; r<=row+1;r++ ){
            for( int j=column-1;j<=column+1;j++ ){
                if( r !=row || j != column)
                    size+=dfsSearch(matrix, r, j);
            }
        }
        return size;
    }

    private static int[][] prepareMatrixData() {
        int[][] matrix = new int[6][7];
        matrix[0][3] = 1;
        matrix[0][4] = 1;
        matrix[1][1] = 1;
        matrix[1][4] = 1;
        matrix[1][5] = 1;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][3] = 1;
        matrix[2][6] = 1;
        matrix[3][5] = 1;
        matrix[4][0] = 1;
        matrix[4][1] = 1;
        matrix[5][3] = 1;
        return matrix;
    }

}
