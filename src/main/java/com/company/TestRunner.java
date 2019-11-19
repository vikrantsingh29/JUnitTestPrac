package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestRunner {
    @Test
    public void testRunner() {
        System.out.print("Test Runner");
        String str1 = new String ("vikrant");
        String str2 = new String ("vikrantSingh");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"aplha", "beta", "gamma"};
        String[] resultArray =  {"one", "two", "three"};

        //Check that two objects are equal
        assertEquals(str1, str2);

        //Check that a condition is true
        assertTrue (val1 < val2);

        //Check that a condition is false
        assertFalse(val1 > val2);

        //Check that an object isn't null
        assertNotNull(str1);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);
    }
}
