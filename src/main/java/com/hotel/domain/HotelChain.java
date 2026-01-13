package com.hotel.domain;

public class HotelChain {

    private final String name;
    private final int id;

    public HotelChain(String name, int id) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name required");
        if (id <= 0)
            throw new IllegalArgumentException("Invalid id");

        this.name = name;
        this.id = id;
    }

    public Reservation makeReservation(Hotel hotel, Guest guest) {
        if (!canMakeReservation(hotel))
            throw new IllegalStateException("Reservation denied");

        return hotel.createReservation(guest);
    }

    private boolean canMakeReservation(Hotel hotel) {
        return hotel != null && hotel.available();
    }
}
