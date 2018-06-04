package com.company;

import java.util.Scanner;

public class ThreeGroups {
    public static final int divider = 3;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] given = in.nextLine().split(" ");
        int[] numbers = new int[given.length];
        for (int i = 0; i < given.length; i++) {
            int numb = Integer.parseInt(given[i]);
            numbers[i] = numb;
        }

        int[][] moduloValues = new int[divider][numbers.length];
        int indexOfFullDivision = 0;
        int indexOf1 = 0;
        int indexOf2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i] % 3) {
                case 0:
                    moduloValues[0][indexOfFullDivision] = numbers[i];
                    indexOfFullDivision++;
                    break;
                case 1:
                    moduloValues[1][indexOf1] = numbers[i];
                    indexOf1++;
                    break;
                case 2:
                    moduloValues[2][indexOf2] = numbers[i];
                    indexOf2++;
                    break;
            }
        }
        for (int i = 0; i < divider; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (moduloValues[i][j] != 0) {
                    System.out.print(moduloValues[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
