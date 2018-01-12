package com.tnewcomb.codewars.kyu5;

import java.awt.Point;

/**
 * Created by Travis on 12/6/2017.
 */
public class FillArea {

    public static int[][] fillArea(int[][] input, Point start) {
        int[][] output = new int[input.length][input[0].length];
        boolean writing = false;
        boolean firstOne = false;
        for (int row = 0; row < input.length; row++) {
            for (int col = 0; col < input[row].length; col++) {
                int point = input[row][col];

                if (point == 0) {
                    if (writing) {
                        //change to a 1!
                        point = 1;
                    }
                } else if (col + 1 == input[row].length) {
                    //is 1 and is last number in row
                    if (!firstOne) {
                        //fill all ones
                    }

                    writing = false;

                } else {
                    //is 1 somewhere in the middle
                    if (!firstOne) {
                        firstOne = true;
                        writing = true;
                    }
                }

                output[row][col] = point;
            }
            firstOne = false;
            writing = false;
        }
        return output;
    }


    public static void main(String[] args) {
        int[][] input = {{0,0,0,0}, {0,1,1,1}, {0,1,0,1}, {1,0,0,1}, {0,0,0,0}};

        fillArea(input, new Point(0,0));
    }

}
