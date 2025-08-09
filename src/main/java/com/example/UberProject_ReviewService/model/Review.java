package com.example.UberProject_ReviewService.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "Booking_Review")
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseClass
{

    @Column(nullable = false)
    private Double rating;

    private String phoneNumber;
    private String content;


    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void setContent(String content) {
        this.content = content;
    }


    public static Builder create(){
        return new Builder();
    }

    public static class Builder{
        private Double rating;

        private String phoneNumber;
        private String content;

        public Builder rating(Double rating) {
            this.rating = rating;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }


        public Review build(){
            Review r = new Review();
            r.setRating(this.rating);
            r.setPhoneNumber(this.phoneNumber);
            r.setContent(this.content);
            return r;

        }


    }



}
