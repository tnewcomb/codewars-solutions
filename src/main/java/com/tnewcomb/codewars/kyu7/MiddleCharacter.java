package com.tnewcomb.codewars.kyu7;

/**
 * Created by Travis on 12/5/2017.
 */
public class MiddleCharacter {

    public static String getMiddle(String word) {
        int len = word.length();
        if (len % 2 == 0) {
            return String.valueOf(word.charAt((len / 2) - 1)) + String.valueOf(word.charAt((len / 2)));
        } else {
            return String.valueOf(word.charAt((len / 2)));
        }
    }
}
