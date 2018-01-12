package com.tnewcomb.codewars.kyu7;

/**
 * Created by Travis on 1/11/2018.
 */
public class Mumbling {
    public static String accum(String s) {
        char[] chars = s.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            result += writeOutput(chars[i], i);

            if ((i + 1) < chars.length) {
                result += "-";
            }
        }

        return result;
    }

    private static String writeOutput(char c, int position) {
        String output = "";
        for (int i = 0; i < (position + 1); i++) {
            if (i == 0) {
                output += Character.toString(c).toUpperCase();
            } else {
                output += Character.toString(c).toLowerCase();
            }
        }

        return output;
    }
}
