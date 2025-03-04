package com.example;

public class Calculator {
    private int value1;
    private int value2;

    // Constructors
    public Calculator() {
    }

    public Calculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    // Getters and Setters
    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    // Addition
    public int add() {
        return value1 + value2;
    }

    // Subtraction
    public int subtract() {
        return value1 - value2;
    }

    // Check if a number is even within range (1-100)
    public static boolean isEven(int num) {
        if (num < 1 || num > 100) {
            throw new IllegalArgumentException("Number must be between 1 and 100");
        }
        return num % 2 == 0;
    }
}
