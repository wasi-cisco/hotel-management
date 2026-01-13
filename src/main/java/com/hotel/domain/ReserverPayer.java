package com.hotel.domain;

import com.hotel.domain.value.CreditCard;
import com.hotel.domain.value.Identity;

public class ReserverPayer {

    private final CreditCard creditCardDetails;
    private final Identity id;

    public ReserverPayer(CreditCard creditCardDetails, Identity id) {
        if (creditCardDetails == null || id == null)
            throw new IllegalArgumentException("Invalid payer");

        this.creditCardDetails = creditCardDetails;
        this.id = id;
    }

    public static ReserverPayer create(CreditCard card, Identity id) {
        return new ReserverPayer(card, id);
    }
}
