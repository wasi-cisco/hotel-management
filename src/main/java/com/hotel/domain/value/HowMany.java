package com.hotel.domain.value;

public class HowMany {
    private final int number;

    public HowMany(int number) {
        if (number <= 0)
            throw new IllegalArgumentException("Must be greater than zero");
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}