package com.hotel.domain.value;

public class Identity{
    private final String id;
    
    public Identity(String id){
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Identity Required");
        this.id =id;
    }
}