package com.tnewcomb.codewars.kyu7;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Travis on 12/5/2017.
 */
public class HighestLowestTest {

    @Test
    public void SomeTest() {
        assertThat(HighestLowest.HighAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }

    @Test
    public void PlusMinusTest() {
        assertThat(HighestLowest.HighAndLow("1 -1"), is("1 -1"));
    }

    @Test
    public void PlusPlusTest() {
        assertThat(HighestLowest.HighAndLow("1 1"), is("1 1"));
    }

    @Test
    public void MinusMinusTest() {
        assertThat(HighestLowest.HighAndLow("-1 -1"), is("-1 -1"));
    }

    @Test
    public void PlusMinusZeroTest() {
        assertThat(HighestLowest.HighAndLow("1 -1 0"), is("1 -1"));
    }

    @Test
    public void PlusPlusZeroTest() {
        assertThat(HighestLowest.HighAndLow("1 1 0"), is("1 0"));
    }

    @Test
    public void MinusMinusZeroTest() {
        assertThat(HighestLowest.HighAndLow("-1 -1 0"), is("0 -1"));
    }

    @Test
    public void SingleTest() {
        assertThat(HighestLowest.HighAndLow("42"), is("42 42"));
    }


}
