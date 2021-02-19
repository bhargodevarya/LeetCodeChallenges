package com.graph.matrix;

import java.util.HashSet;
import java.util.Set;

public class GraphTraversal {

    private static Set<Integer> visited = new HashSet<>();

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int suffix = 0;
        for (int i =0; i<matrix.length; i++) {
            for (int j =0; j <matrix.length; j++) {
                matrix[i][j] = j + 1+ suffix;
            }
            suffix = matrix[i][matrix.length-1];
        }
        for (int i =0; i<matrix.length; i++) {
            for (int j =0; j <matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        recursiveDfs(matrix,0, 0);
    }

    /**
     * Recursive DFS
     * @param matrix
     * @param row
     * @param col
     */
    private static void recursiveDfs(int[][] matrix, int row, int col) {
        if (row > matrix.length-1  || row < 0 || col > matrix.length-1 || col < 0)
            return;

        if (visited.contains(matrix[row][col])){
            return;
        }
        visited.add(matrix[row][col]);
        System.out.print(matrix[row][col] + " ");

        recursiveDfs(matrix, row+1, col);
        recursiveDfs(matrix, row-1, col);
        recursiveDfs(matrix, row, col+1);
        recursiveDfs(matrix, row, col-1);
        recursiveDfs(matrix, row-1, col-1);
        recursiveDfs(matrix, row+1, col+1);
        recursiveDfs(matrix, row-1, col+1);
        recursiveDfs(matrix, row+1, col-1);
    }
}
