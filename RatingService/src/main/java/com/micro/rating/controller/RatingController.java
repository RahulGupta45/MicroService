package com.micro.rating.controller;


import com.micro.rating.entities.Rating;
import com.micro.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/create")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        Rating rating1 = ratingService.create(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @GetMapping("/get/{ratingId}")
    public ResponseEntity<Rating> getRating(@PathVariable String ratingId){
        Rating rtId = ratingService.getRating(ratingId);
        return ResponseEntity.status(HttpStatus.CREATED).body(rtId);
    }

    @RequestMapping("/all")
    public ResponseEntity<List<Rating>> getAllRating(){
        List<Rating> ratingList = ratingService.getAllRating();
        return ResponseEntity.ok(ratingList);
    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<Rating> getRatingByUserId(@PathVariable String userId){
        Rating user = ratingService.getRating(userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<Rating> getRatingByHotelId(@PathVariable String hotelId){
        Rating hotel = ratingService.getRating(hotelId);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel);
    }

}
