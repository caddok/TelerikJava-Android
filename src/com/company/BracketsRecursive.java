package com.company;

import java.util.*;

public class BracketsRecursive {

    public static void main(String[] args) {
        int maxLength = 6;
        String expression = "";
        HashSet<String> generatedBrackets= generateExpression(expression,maxLength);
        for (String expr : generatedBrackets) {
            System.out.println(expr);
        }
    }
    public static HashSet generateExpression(String expression, int length) {
        HashSet<String> bracketCollection = new HashSet<>();

        if (expression.length() >= length) {
            bracketCollection.add(expression);
            return bracketCollection;
        }

        HashSet<String> currentBrackets = generateExpression(expression + "()",length);
        bracketCollection.addAll(currentBrackets);

        currentBrackets = generateExpression("(" + expression + ")",length);
        bracketCollection.addAll(currentBrackets);

        currentBrackets = generateExpression("()" + expression,length);
        bracketCollection.addAll(currentBrackets);

        return bracketCollection;
    }
}
