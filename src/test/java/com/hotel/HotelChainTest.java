package com.hotel.domain;

import com.hotel.domain.value.Address;
import com.hotel.domain.value.Name;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelChainTest {

    @Test
    void shouldMakeReservationSuccessfully() {
        HotelChain chain = new HotelChain("Pearl Chain", 1);
        Hotel hotel = new Hotel("Pearl Continental");
        hotel.addRoom(new Room(101));
        Guest guest = Guest.create(new Name("Ali"), new Address("Lahore"));

        Reservation reservation = chain.makeReservation(hotel, guest);
        assertNotNull(reservation);
    }

    @Test
    void shouldThrowIfHotelNull() {
        HotelChain chain = new HotelChain("Pearl Chain", 1);
        Guest guest = Guest.create(new Name("Ali"), new Address("Lahore"));
        assertThrows(IllegalStateException.class, () -> chain.makeReservation(null, guest));
    }

    @Test
    void shouldThrowIfNoRoomsAvailable() {
        HotelChain chain = new HotelChain("Pearl Chain", 1);
        Hotel hotel = new Hotel("Empty Hotel"); // no rooms
        Guest guest = Guest.create(new Name("Ali"), new Address("Lahore"));

        assertThrows(IllegalStateException.class, () -> chain.makeReservation(hotel, guest));
    }
}
