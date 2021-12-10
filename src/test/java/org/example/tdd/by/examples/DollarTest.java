package org.example.tdd.by.examples;

import org.junit.jupiter.api.Test;

/*
- $5 + 10 CHF = $10 if rate is 2:1
- (DONE) $5 * 2 = $10
- Make “amount” private
- Dollar side effects?
- Money rounding?
*/

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
