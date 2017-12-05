package com.tnewcomb.codewars.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by Travis on 12/4/2017.
 */
public class BusMasteringTest {
    @Test
    public void basicTests() {
        assertEquals(BusMastering.arbitrate("001000101", 9), "001000000");
        assertEquals(BusMastering.arbitrate("000000101", 9), "000000100");
        assertEquals(BusMastering.arbitrate("0000", 4), "0000");
    }


}
