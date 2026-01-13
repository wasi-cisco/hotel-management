package com.hotel.domain;

import com.hotel.domain.value.Money;
import com.hotel.domain.value.RoomKind;

public class RoomType {

    private final RoomKind kind;
    private final Money cost;

    public RoomType(RoomKind kind, Money cost) {
        if (kind == null || cost == null)
            throw new IllegalArgumentException("RoomType invalid");

        this.kind = kind;
        this.cost = cost;
    }
}
