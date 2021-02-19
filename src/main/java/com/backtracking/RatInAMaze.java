package com.backtracking;

public class RatInAMaze {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        /**
         * 1 1 0 1 1
         * 1 1 1 1 1
         * 1 1 0 1 1
         * 0 1 1 0 1
         * 1 0 1 1 1
         */

        for (int i =0; i < matrix.length; i++)
            for (int j =0; j < matrix.length; j++) {
                if ((i == 0 && j == 2) || (i == 2 && j == 2) || (i == 3 && j == 0) || (i == 3 && j == 3) || (i == 4 && j == 1)) {
                    matrix[i][j] = 0;
                    continue;
                }
                matrix[i][j] = 1;
            }
        int[][] soln = new int[5][5];
        solve(matrix, soln);
        //printMatrix(soln);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i =0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void solve(int[][] matrix, int[][] soln) {
        recur(matrix, soln, 0,0,1, new int[matrix.length][matrix.length]);
    }

    private static void recur(int[][] matrix, int[][] soln, int row, int col, int step, int[][] visited) {
        if (row == matrix.length-1 && col == matrix.length-1) {
            soln[row][col] = step;
            printMatrix(soln);
            System.out.println(">>>>>>>>>>>>>>>>>>");
            return;
        }

        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix.length) {
            return;
        }

        if (matrix[row][col] == 0){
            return;
        }

        if (visited[row][col] == 1){
            return;
        }

        visited[row][col] = 1;
        soln[row][col] = step;

        recur(matrix, soln, row+1, col, step+1, visited);
        recur(matrix, soln, row-1, col, step+1, visited);
        recur(matrix, soln, row, col+1, step+1, visited);
        recur(matrix, soln, row, col-1, step+1, visited);

        visited[row][col] = 0;
        soln[row][col] = 0;
    }
}
