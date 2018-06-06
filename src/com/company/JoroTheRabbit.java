package com.company;

import java.util.*;

public class JoroTheRabbit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(", ");
        ArrayList<Integer> path = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            path.add(number);
        }

        ArrayList<Integer> lowestToHighest = (ArrayList<Integer>) path.clone();
        Collections.sort(lowestToHighest,Comparator.naturalOrder());
        int maxPath = 0;
        for (int i = 0; i < lowestToHighest.size(); i++) {
            int firstStep = path.indexOf(lowestToHighest.get(i));
            int tempMaxPath = findMaxPath(firstStep,path);
            if (tempMaxPath > maxPath) {
                maxPath = tempMaxPath;
            }
        }
        System.out.println(maxPath);
    }

    public static int findMaxPath(int start,ArrayList path) {
        int maxPath = 0;
        int step = 0;
        ArrayList<Integer> possibleSteps = new ArrayList<>();
        int stepsMade = 0;
        for (int i = start ; stepsMade < path.size(); i = (++i) % path.size()) {
            int first =(int) path.get(start);
            if (first < (int)path.get(i)) {
                int indexOfBigger = i + start + 1;
                step = Math.abs(start - indexOfBigger);
                possibleSteps.add(step);
            }
            stepsMade++;
        }
        if (possibleSteps.size() == 0) {
            return 1;
        }
        for (int i = 0; i < possibleSteps.size(); i++) {
            boolean[] visited = new boolean[path.size()];
            int length = 1;
            int stepToTrack = possibleSteps.get(i);
            int prevStep = (int) path.get(start % path.size());
            int nextStep = (int) path.get((start + stepToTrack) % path.size());
            while (true) {
                if (prevStep < nextStep && visited[path.indexOf(prevStep)] == false) {
                    length++;
                    visited[path.indexOf(prevStep)] = true;
                    prevStep = nextStep;
                    nextStep = (int) path.get((path.indexOf(prevStep) + stepToTrack) % path.size());
                }
                else {
                    break;
                }
            }
            if (length > maxPath) {
                maxPath = length;
            }
        }
        return maxPath;
    }
}
