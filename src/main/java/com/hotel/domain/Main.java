package com.hotel;

import com.hotel.domain.*;
import com.hotel.domain.value.*;

public class Main {
    public static void main(String[] args) {

        HotelChain chain = new HotelChain("Pearl Chain", 1);
        Hotel hotel = new Hotel("Pearl Continental");

        hotel.addRoom(new Room(101));
        hotel.addRoom(new Room(102));

        Guest guest = Guest.create(
                new Name("Ali"),
                new Address("Lahore")
        );

        Reservation reservation = chain.makeReservation(hotel, guest);

        System.out.println("Reservation successful");
    }
}
