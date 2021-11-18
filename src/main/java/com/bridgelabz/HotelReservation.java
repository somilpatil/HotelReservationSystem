package com.bridgelabz;

import java.util.*;

public class HotelReservation {
    private List<Hotel> hotels;

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");
    }

    public void add(Hotel hotel) {
        this.hotels.add(hotel);
    }

    public List<Hotel> getHotelList() {
        return this.hotels;
    }
}