package com.piyush.tddjunit.tddjunit;

import com.piyush.tddjunit.tddjunit.model.Dollar;
import com.piyush.tddjunit.tddjunit.model.Franc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void test2Multiplication() {
        Dollar one = new Dollar(1);
        one.times(3);
        assertEquals(3,one);
    }

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }


    @Test
    public void testEqualityDollar() {
        assertEquals(new Dollar(1), new Dollar(1));
        assertNotEquals(new Dollar(1), new Dollar(2));
    }

    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(new Franc(10), product);
        product = five.times(3);
        assertEquals(new Franc(15), product);
    }

    @Test
    void testEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }
}
