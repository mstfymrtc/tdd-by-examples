package org.example.tdd.by.examples;

class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;

    }

    Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }
}
