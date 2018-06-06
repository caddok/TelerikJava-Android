package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class BitShiftMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int numberOfCells = in.nextInt();
        int[] cells = new int[numberOfCells];
        for (int i = 0; i < numberOfCells; i++) {
            cells[i] = in.nextInt();
        }

        BigInteger[] powOfTwo = new BigInteger[rows + columns - 1];
        BigInteger powTwo = BigInteger.ONE;

        for (int i = 0; i < rows + columns - 1; i++) {
            powOfTwo[i] = powTwo;
            powTwo = powTwo.multiply(BigInteger.valueOf(2));
        }

        boolean[][] matrix = new boolean[rows][columns];

        int coef = Math.max(rows,columns);
        int currentR = rows - 1;
        int currentC = 0;
        BigInteger result = BigInteger.ZERO;

        for(int cell : cells) {
            int targetR = cell / coef;
            int targetC = cell % coef;

            int horizontalDirection;
            if (currentC < targetC) {
                horizontalDirection = 1;
            }
            else {
                horizontalDirection = -1;
            }

            int verticalDirection;

            if (currentR <= targetR) {
                verticalDirection = 1;
            }
            else {
                verticalDirection = -1;
            }

            while (currentC != targetC || currentR != targetR) {
                if (!matrix[currentR][currentC]) {
                    matrix[currentR][currentC] = true;
                    int pow = rows - currentC + currentR - 1;
                    result = result.add(powOfTwo[pow]);
                }

                if (currentC != targetC) {
                    currentC += horizontalDirection;
                }
                if (currentR != targetR) {
                    currentR += verticalDirection;
                }
            }
        }

        if (!matrix[currentR][currentC]) {
            matrix[currentR][currentC] = true;
            int pow = rows - currentC + currentR - 1;
            //result = result.add(pow);
        }

        System.out.println(result);
    }
}
