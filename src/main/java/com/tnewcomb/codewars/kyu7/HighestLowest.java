package com.tnewcomb.codewars.kyu7;


/**
 * Created by Travis on 12/5/2017.
 */
public class HighestLowest {

    public static String HighAndLow(String numbers) {
        String separator = " ";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int endIndex = 1;

        String[] digits = numbers.split(separator);

        for (int i = 0; i < digits.length; i++) {
            int asInt = Integer.valueOf(digits[i]);

            if (asInt < min) {
                min = asInt;
            }

            if (asInt > max) {
                max = asInt;
            }
        }

        return max + separator + min;
    }
}
