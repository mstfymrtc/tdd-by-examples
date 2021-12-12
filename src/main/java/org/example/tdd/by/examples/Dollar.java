package org.example.tdd.by.examples;

class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    Money times(int multiplier) {
        return Money.dollar(this.amount * multiplier);
    }
}
