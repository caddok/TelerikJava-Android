package com.company;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int factorial = in.nextInt();
        int result = 1;
        result = computeFactorial(factorial,result);
        System.out.println(result);
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
    }
    public static int computeFactorial(int factorial,int result) {
        if (factorial == 1) {
            return result;
        }
        result *= factorial;
        return computeFactorial(factorial - 1,result);
    }
}
