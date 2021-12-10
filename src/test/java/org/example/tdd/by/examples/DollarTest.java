package org.example.tdd.by.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
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
    public void testMultiplication3() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
