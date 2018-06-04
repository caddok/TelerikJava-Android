package com.company;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long matrixSize = in.nextInt();
        long[][] matrix = new long[(int) matrixSize][(int) matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (j == 0) {
                    matrix[i][j] = (int) Math.pow(2,i);
                }
                else {
                    matrix[i][j] = matrix[i][j-1] * 2;
                }
            }
        }

        long sumAboveDiagonal = 0;
        long diagonalSum = 0;

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i != j) {
                    sumAboveDiagonal += matrix[i][j];
                }
            }
        }
        long sumPlusDiagonal = sumAboveDiagonal/2 + diagonalSum;
        System.out.println(sumPlusDiagonal);
    }
}
