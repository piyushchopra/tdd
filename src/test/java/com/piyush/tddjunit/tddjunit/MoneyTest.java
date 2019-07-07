package com.piyush.tddjunit.tddjunit;

import com.piyush.tddjunit.tddjunit.model.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product);
        product = five.times(3);
        assertEquals(15, product);
    }

    @Test
    void test2Multiplication() {
        Dollar one = new Dollar(1);
        one.times(3);
        assertEquals(3,one);
    }

    @Test
    public void testEquality() {
        assertEquals(new Dollar(1), new Dollar(1));
        assertNotEquals(new Dollar(1), new Dollar(2));
    }


}
