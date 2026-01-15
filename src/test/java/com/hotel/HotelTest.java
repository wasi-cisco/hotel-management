package com.hotel.domain;

import org.junit.jupiter.api.Test;
import com.hotel.domain.value.Name;
import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void shouldAddRoomSuccessfully() {
        Hotel hotel = new Hotel("Pearl Continental");
        Room room = new Room(101);
        hotel.addRoom(room);
        assertTrue(hotel.available());
    }

    @Test
    void shouldThrowExceptionForNullRoom() {
        Hotel hotel = new Hotel("Pearl Continental");
        assertThrows(IllegalArgumentException.class, () -> hotel.addRoom(null));
    }

    @Test
    void shouldCreateReservationIfRoomsAvailable() {
        Hotel hotel = new Hotel("Pearl Continental");
        Room room = new Room(101);
        hotel.addRoom(room);
        Guest guest = Guest.create(new Name("Ali"), new com.hotel.domain.value.Address("Lahore"));

        Reservation res = hotel.createReservation(guest);
        assertNotNull(res);
    }

    @Test
    void shouldThrowIfNoRoomsAvailable() {
        Hotel hotel = new Hotel("Pearl Continental");
        Guest guest = Guest.create(new Name("Ali"), new com.hotel.domain.value.Address("Lahore"));
        assertThrows(IllegalStateException.class, () -> hotel.createReservation(guest));
    }
}
