package com.company;

import java.util.Scanner;

public class SymetricArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= testCases; i++) {
            String[] numbers = in.nextLine().split(" ");
            int size = numbers.length;
            int counter = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j].equals(numbers[size - j - 1])) {
                    counter++;
                }
                else {
                    break;
                }
            }
            if (counter == size) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }


    }
}
