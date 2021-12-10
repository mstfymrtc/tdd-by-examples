package org.example.tdd.by.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Test
    void testMultiplication() {
        Dollar fiveDollars = new Dollar(5);
        assertEquals(new Dollar(10), fiveDollars.times(2));
        assertEquals(new Dollar(15), fiveDollars.times(3));

        Franc fiveFrancs = new Franc(5);
        assertEquals(new Franc(10), fiveFrancs.times(2));
        assertEquals(new Franc(15), fiveFrancs.times(3));
    }

    @Test
    void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));

        // Two Moneys are equal only if their amounts and classes are equal.
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }
}
