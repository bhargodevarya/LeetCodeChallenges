package com.hackerrank.matrix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 *
 * https://www.hackerrank.com/challenges/queens-attack-2/problem
 *
 * 100000 0
 * 4187 5068
 *
 * 308369
 */
public class QueenAttackTwo {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int val1 = countBoxes(n, r_q+1, c_q, obstacles, 1);
        int val2 = countBoxes(n, r_q+1, c_q+1, obstacles, 2);
        int val3 = countBoxes(n, r_q+1, c_q-1, obstacles, 0);

        int val4 = countBoxes(n, r_q-1, c_q, obstacles, 4);
        int val5 = countBoxes(n, r_q-1, c_q+1, obstacles, 5);
        int val6 = countBoxes(n, r_q-1, c_q-1, obstacles, 3);

        int val7 = countBoxes(n, r_q, c_q+1, obstacles, 7);
        int val8 = countBoxes(n, r_q, c_q-1, obstacles, 6);

        return val1+val2+val3+val4+val5+val6+val7+val8;
    }

    private static int countBoxes(int n, int r_q, int c_q, int[][] obstacles, int direction) {
        System.out.println(r_q);
        if (r_q > n || r_q < 1 || c_q > n || c_q < 1) {
            return 0;
        }
        boolean obs = false;
        for (int i = 0; i < obstacles.length; i++) {
            if (r_q == obstacles[i][0] && c_q == obstacles[i][1]) {
                obs = true;
                break;
            }
        }
        if (obs) {
            return 0;
        }
        switch (direction) {
            case 0: return 1 + countBoxes(n, r_q+1, c_q-1, obstacles, 0);
            case 1: return 1 + countBoxes(n, r_q+1, c_q, obstacles, 1);
            case 2: return 1 + countBoxes(n, r_q+1, c_q+1, obstacles, 2);
            case 3: return 1 + countBoxes(n, r_q-1, c_q-1, obstacles, 3);
            case 4: return 1 + countBoxes(n, r_q-1, c_q, obstacles, 4);
            case 5: return 1 + countBoxes(n, r_q-1, c_q+1, obstacles, 5);
            case 6: return 1 + countBoxes(n, r_q, c_q-1, obstacles, 6);
            case 7: return 1 + countBoxes(n, r_q, c_q+1, obstacles, 7);
        }
        throw new RuntimeException(r_q + " " + c_q + " " + n + " " + direction);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
