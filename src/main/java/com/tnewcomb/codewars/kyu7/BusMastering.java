package com.tnewcomb.codewars.kyu7;

/**
 * Created by Travis on 12/4/2017.
 */
public class BusMastering {

    public static String arbitrate(String input, int n) {
        String output = "";
        boolean accessFound = false;
        for (char c : input.toCharArray()) {
            if (!accessFound && c == '1') {
                output += "1";
                accessFound = true;
            } else {
                output += "0";
            }
        }
        return  output;
    }

}
