package com.hotel.domain.value;

public class Name{
    private final String value;

    public Name(String value){
        if (value == null || value.isBlank())
            throw new IllegalArgumentException("Name Required");
        this.value = value;
    }

    public String getValue(){
        return value;

    }
}