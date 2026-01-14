package com.hotel.domain;

import com.hotel.domain.value.Address;
import com.hotel.domain.value.Name;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void shouldCreateRoomWithValidNumber() {
        Room room = new Room(101);
        assertFalse(room.isOccupied());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void shouldThrowExceptionForInvalidRoomNumber(int number) {
        assertThrows(IllegalArgumentException.class, () -> new Room(number));
    }

    @Test
    void shouldOccupyAndVacateRoom() {
        Room room = new Room(102);
        Guest guest = new Guest(new Name("Ali"), new Address("Lahore"));
        room.createGuest(guest);
        assertTrue(room.isOccupied());
        room.removeGuest();
        assertFalse(room.isOccupied());
    }

    @Test
    void shouldNotAllowOccupyWhenAlreadyOccupied() {
        Room room = new Room(103);
        Guest guest1 = new Guest(new Name("Ali"), new Address("Lahore"));
        Guest guest2 = new Guest(new Name("Sara"), new Address("Karachi"));
        room.createGuest(guest1);
        assertThrows(IllegalStateException.class, () -> room.createGuest(guest2));
    }
}
