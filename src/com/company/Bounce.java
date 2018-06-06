package com.company;

import java.util.Scanner;

public class Bounce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] powTwo = new long[n + m - 1];

        for (int i = 1; i < n + m - 1; i++) {
            powTwo[i] = powTwo[i -1] * 2;
        }

        int currentR = 0;
        int currentC = 0;

        int prevR = -1;
        int prevC = -1;

        int horizontal = 1;
        int vertical = 1;

        long result = 0;

        while (true) {
             result += powTwo[currentR + currentC];
            int nextR = currentR + vertical;
            int nextC = currentC + horizontal;
            if (currentR + vertical < 0 || n <= currentR + vertical) {
                currentR += vertical;
                currentC += horizontal;
            }
        }

    }
}
