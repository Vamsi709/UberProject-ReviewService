package com.example.UberProject_ReviewService.service;
import com.example.UberProject_ReviewService.Repository.ReviewRepository;
import com.example.UberProject_ReviewService.model.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Review r = Review.create()
                .rating(4.0)
                .phoneNumber("99091")
                .content("Amaze ride")
                .build();

        reviewRepository.save(r);
        System.out.println(r);
    }
}

