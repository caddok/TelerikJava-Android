package com.company;

import java.text.DecimalFormat;
import java.util.*;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        double[] numbers = new double[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }
        DecimalFormat format = new DecimalFormat("#.##");
        DoubleSummaryStatistics stats = Arrays.stream(numbers).summaryStatistics();
        System.out.printf("min=%.2d",stats.getMin());
    //    System.out.println();
        System.out.printf("max=%.2d",stats.getMax());
     //   System.out.println();
        System.out.printf("sum=%.2d",stats.getSum());
        System.out.printf("average=%2.d",stats.getAverage());
    }
}
