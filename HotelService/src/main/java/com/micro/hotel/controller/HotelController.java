package com.micro.hotel.controller;

import com.micro.hotel.entities.Hotel;
import com.micro.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/create")
    private ResponseEntity<Hotel> createHotel(@RequestBody  Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }

    @GetMapping("/get/{hotelId}")
    private ResponseEntity<Hotel> getHotel(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.get(hotelId));
    }

    @GetMapping("/all")
    private ResponseEntity<List<Hotel>> getAllHotel(){
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.getAll());
    }
}
