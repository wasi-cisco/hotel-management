package com.hotel.domain;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private final String name;
    private final List<Room> rooms = new ArrayList<>();

    public Hotel(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Hotel name required");
        this.name = name;
    }

    public void addRoom(Room room) {
        if (room == null)
            throw new IllegalArgumentException("Room required");
        rooms.add(room);
    }

    public boolean available() {
        return rooms.stream().anyMatch(room -> !room.isOccupied());
    }

    public Reservation createReservation(Guest guest) {
        if (!available())
            throw new IllegalStateException("No rooms available");

        return Reservation.create(
                java.time.LocalDate.now().plusDays(1),
                java.time.LocalDate.now().plusDays(2),
                rooms.size() + 1
        );
    }
}
