package com.hotel.domain;

public class Room {

    private final int number;
    private Guest occupant;

    public Room(int number) {
        if (number <= 0)
            throw new IllegalArgumentException("Invalid room number");
        this.number = number;
    }

    public void createGuest(Guest guest) {
        if (guest == null)
            throw new IllegalArgumentException("Guest required");
        if (occupant != null)
            throw new IllegalStateException("Room already occupied");

        this.occupant = guest;
    }

    public void removeGuest() {
        this.occupant = null;
    }

    public boolean isOccupied() {
        return occupant != null;
    }
}
