package com.company;

import java.util.Scanner;

public class RecursiveReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder toBeReversed = new StringBuilder(input);
        StringBuilder reversed = new StringBuilder();
        reversed = reverse(toBeReversed,reversed);
        System.out.println(reversed.toString());
    }

    public static StringBuilder reverse(StringBuilder toBe, StringBuilder reversed) {
        if (toBe.length() == 0) {
            return reversed;
        }

        reversed.append(toBe.charAt(toBe.length() - 1));
        toBe.deleteCharAt(toBe.length() - 1);
        return reverse(toBe,reversed);
    }
}
