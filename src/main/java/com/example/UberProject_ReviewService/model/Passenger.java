package com.example.UberProject_ReviewService.model;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

public class Passenger extends BaseClass{

    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings;
}
