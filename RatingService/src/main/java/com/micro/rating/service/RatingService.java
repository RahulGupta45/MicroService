package com.micro.rating.service;

import com.micro.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating create(Rating rating);

    Rating getRating(String ratingId);

    List<Rating> getAllRating();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}
