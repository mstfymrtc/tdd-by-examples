package org.example.tdd.by.examples;

class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    Money times(int multiplier) {
        return Money.franc(this.amount * multiplier);
    }
}
