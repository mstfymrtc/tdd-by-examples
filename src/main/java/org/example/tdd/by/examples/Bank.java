package org.example.tdd.by.examples;

public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
