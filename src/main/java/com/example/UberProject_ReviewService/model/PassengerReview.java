package com.example.UberProject_ReviewService.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class PassengerReview extends Review{
    private String passengerReviewCommemnt;


}
