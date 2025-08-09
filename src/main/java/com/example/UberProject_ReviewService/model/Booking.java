package com.example.UberProject_ReviewService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseClass{
    @OneToOne(cascade = CascadeType.PERSIST)
    private Review review;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long totalDistance;
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;
    @ManyToOne
    private Passenger passenger;
    @ManyToOne
    private Driver driver;
}
