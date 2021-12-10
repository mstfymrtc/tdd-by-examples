package org.example.tdd.by.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
    }

//    @Test
//    public void testMultiplication2() {
//        Dollar five = new Dollar(5);
//        five.times(2);
//        assertEquals(10, five.amount);
//        five.times(3);
//        assertEquals(15, five.amount);
//    }

    @Test
    void testMultiplication3() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

    }
}
