package com.company;

import java.util.*;

public class NumbersTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int triangleHeight = in.nextInt();
        printUpperHalf(triangleHeight);
        printLowerHalf(triangleHeight);

    }
    public static void printUpperHalf(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            sb.append(i);
            sb.append(" ");
            System.out.println(sb);
        }
    }
    public static void printLowerHalf(int number) {
        StringBuilder sb = new StringBuilder();
        int lastDigit = 1;
        int side = number - 1;
        for (int i = 0; i < number - 1; i++) {
            if (side == 1) {
                sb.append(side);
                System.out.println(side);
            }else {
                while (lastDigit <= side) {
                    sb.append(lastDigit);
                    sb.append(" ");
                    lastDigit++;
                }
                System.out.println(sb);
                sb.setLength(0);
                side--;
            }
            lastDigit = 1;
        }

    }
}
