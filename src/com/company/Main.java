package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] a = {"belt", "hat", "jelly", "bubble gum"};
        averageLength(a);
    }

    public static double averageLength(String[] strArray) {
        double stringSum;
        double aveLengths;
        double averageLengthSum = 0;
        ArrayList<Double> aveLengthSum = new ArrayList<Double>();
        for (int i = 0; i < strArray.length; i++) {
            stringSum = strArray[i].length();
            aveLengths = stringSum / strArray.length;
            aveLengthSum.add(aveLengths);
            averageLengthSum += aveLengthSum.get(i);
        }
        System.out.println(averageLengthSum);
        return averageLengthSum;
    }
}
