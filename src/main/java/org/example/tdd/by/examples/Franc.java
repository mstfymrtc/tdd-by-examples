package org.example.tdd.by.examples;

class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;

    }

    Money times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}
