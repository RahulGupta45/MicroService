package com.micro.rating.repositories;

import com.micro.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating,String> {

    //custom methods
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
