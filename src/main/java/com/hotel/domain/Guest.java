package com.hotel.domain;

import com.hotel.domain.value.Address;
import com.hotel.domain.value.Name;

public class Guest {

    private final Name name;
    private final Address addressDetails;

    public Guest(Name name, Address addressDetails) {
        if (name == null || addressDetails == null)
            throw new IllegalArgumentException("Guest details required");

        this.name = name;
        this.addressDetails = addressDetails;
    }

    public static Guest create(Name name, Address address) {
        return new Guest(name, address);
    }
}
