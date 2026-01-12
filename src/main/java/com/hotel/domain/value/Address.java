package com.hotel.domain.value;

public class Address{
    private final String details;

    public Address(String details){

        if (details == null || details.isBlank())
            throw new IllegalArgumentException("Address Required");
        this.details = details;
    }
    public String getDetails(){
        return details;
    }
}