package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] task = in.nextLine().split(" ");
        for (int i = task.length - 1; i >= 0 ; i--) {
            if(i == 0) {
                System.out.print(task[i]);
            }
            else {
                System.out.print(task[i] + "," + " ");
            }
        }

    }
}
