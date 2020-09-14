package ru.job4j;

import java.util.Arrays;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        char[] chNum = Integer.toString(num).toCharArray();
        for (int i = 0; i < chNum.length; i++) {
            sum += Character.getNumericValue(chNum[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(DigitSum.sum(1));
    }
}
