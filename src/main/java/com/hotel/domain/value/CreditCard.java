package com.hotel.domain.value;

public class CreditCard {
    private final String number;

    public CreditCard(String number) {
        if (number == null || number.length() < 12)
            throw new IllegalArgumentException("Invalid card number");
        this.number = number;
    }
}