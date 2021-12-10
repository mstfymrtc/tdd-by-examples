package org.example.tdd.by.examples;

class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;

    }

    Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
