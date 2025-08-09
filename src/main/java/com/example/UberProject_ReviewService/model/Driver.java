package com.example.UberProject_ReviewService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Driver {
    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings;

    private String name;
    @Column(nullable = false)
    private String licenseNumber;

    public Driver(List<Booking> bookings) {
        this.bookings = new ArrayList<>();
    }
}
