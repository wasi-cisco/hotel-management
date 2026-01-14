package com.hotel.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void shouldCreateReservationSuccessfully() {
        LocalDate start = LocalDate.now().plusDays(1);
        LocalDate end = LocalDate.now().plusDays(2);
        Reservation reservation = Reservation.create(start, end, 1);
        assertNotNull(reservation);
    }

    @Test
    void shouldThrowForNullDates() {
        assertThrows(IllegalArgumentException.class,
                () -> new Reservation(null, LocalDate.now().plusDays(1), 1));
        assertThrows(IllegalArgumentException.class,
                () -> new Reservation(LocalDate.now(), null, 1));
    }

    @Test
    void shouldThrowForEndDateBeforeStartDate() {
        LocalDate start = LocalDate.now().plusDays(2);
        LocalDate end = LocalDate.now().plusDays(1);
        assertThrows(IllegalArgumentException.class,
                () -> new Reservation(start, end, 1));
    }
}
