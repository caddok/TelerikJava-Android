package com.company;

import java.util.*;

public class PrimeToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prime = in.nextInt();
        /*ArrayList<Integer> primes = new ArrayList<>();
        primes = getPrimes(prime);
        primes.add(0,1);
        for (int i = 0; i < primes.size(); i++) {
            System.out.print(primes.get(i) + " ");
        }*/
        int biggest = getPrimes(prime);
        System.out.println(biggest);
    }
    public static int getPrimes(int number) {
        //ArrayList<Integer> primes = new ArrayList<>();
        int biggest = 0;
        for (int i = number; i > 1; i--) {
            int dividers = 1;
            for (int j = 2; j <= number; j++) {
                if (i % j == 0) {
                    dividers++;
                }
            }
            if (dividers == 2) {
                biggest = i;
                break;
            }
        }
        return biggest;
    }
}
