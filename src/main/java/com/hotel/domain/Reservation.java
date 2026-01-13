package com.hotel.domain;

import java.time.LocalDate;

public class Reservation {

    private final LocalDate reservationDate;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int number;

    public Reservation(LocalDate startDate, LocalDate endDate, int number) {
        if (startDate == null || endDate == null)
            throw new IllegalArgumentException("Dates required");
        if (endDate.isBefore(startDate))
            throw new IllegalArgumentException("Invalid date range");

        this.reservationDate = LocalDate.now();
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
    }

    public static Reservation create(LocalDate start, LocalDate end, int number) {
        return new Reservation(start, end, number);
    }
}
