package com.hotel.domain;

import com.hotel.domain.value.Address;
import com.hotel.domain.value.Name;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    void shouldCreateGuestSuccessfully() {
        Guest guest = Guest.create(new Name("Ali"), new Address("Lahore"));
        assertNotNull(guest);
    }

    @Test
    void shouldThrowForNullName() {
        assertThrows(IllegalArgumentException.class,
                () -> Guest.create(null, new Address("Lahore")));
    }

    @Test
    void shouldThrowForNullAddress() {
        assertThrows(IllegalArgumentException.class,
                () -> Guest.create(new Name("Ali"), null));
    }
}
