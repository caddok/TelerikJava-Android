package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Indices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        boolean[] usedIndeces = new boolean[count];
        int cycleStartIndex = -1;
        int currentIndex = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while (-1 < currentIndex && currentIndex > count - 1) {
            if (usedIndeces[currentIndex] == true) {
                cycleStartIndex = currentIndex;
                break;
            }
            usedIndeces[currentIndex] = true;
            result.add(currentIndex);
            currentIndex = numbers[currentIndex];
        }

        StringBuilder output = new StringBuilder();
        for(int x:result) {
            if (cycleStartIndex != -1 && x== cycleStartIndex) {
                output.append("(");
            }
            output.append(x);
            output.append(" ");
        }

        if (cycleStartIndex != -1) {
            output.append(")");
        }

        String outputString = output.toString();
        outputString = outputString.replace(" (","(");
        outputString = outputString.replace(" )",") ");
        outputString = outputString.trim();

        System.out.println(outputString);
    }
}
