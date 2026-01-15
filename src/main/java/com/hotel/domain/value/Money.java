package com.hotel.domain.value;

public class Money{
    private final double amount;

    public Money(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Money Cannot be Negative");
            

        }
        this.amount = amount;
        
        }
        public double getAmount(){
            return amount;
    }
}