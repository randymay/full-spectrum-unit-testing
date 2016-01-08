package com.blaazinsoftware.advancedUnitTesting.module1;

import com.blaazinsoftware.module1.SimpleClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Randy May
 *         Date: 2016-01-07
 */
public class SimpleClassTest {
    @Test
    public void testAddTwoNumbers() throws Exception {
        SimpleClass simpleClass = new SimpleClass();

        assertEquals(6, simpleClass.addTwoNumbers(4, 2));
    }
}
