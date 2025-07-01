package com.utils;

public class ExceptionThrower {
    public void throwIfNegative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative not allowed");
        }
    }
}
