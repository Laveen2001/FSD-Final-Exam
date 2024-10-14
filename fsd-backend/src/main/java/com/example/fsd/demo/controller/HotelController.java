package com.example.fsd.demo.controller;


import com.example.fsd.demo.entity.Hotel;
import com.example.fsd.demo.service.HotelService;
import com.example.fsd.demo.util.GlobalResponseHandler;
import org.apache.tomcat.util.digester.Digester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class HotelController {


    @Autowired
    private HotelService hotelService;

//    1. View a list of available hotels.
//            2. Add a new hotel (API only).
//            3. Update hotel details (API Only).
//            4. Delete a hotel (API Only).



    @GetMapping("/v1")
    public ResponseEntity getAllHotels(){
        return  GlobalResponseHandler.createGenericResponse(hotelService.getAllHotels(), null,HttpStatus.OK);
    }

    // Add a new hotel
    @PostMapping("/v1")
    public ResponseEntity addHotel( @RequestBody Hotel hotel ){
        return GlobalResponseHandler.createGenericResponse(hotelService.addHotel(hotel), null, HttpStatus.CREATED);
    }



    @PutMapping("/v1/{id}")
    public ResponseEntity updateHotel(@PathVariable("id") long id, @RequestBody Hotel hotel){
        return GlobalResponseHandler.createGenericResponse(hotelService.updateHotel(id,hotel), null, HttpStatus.ACCEPTED);

    }

    @DeleteMapping("/v1/{id}")
    public ResponseEntity deleteHotel(@PathVariable("id") long id){
        return GlobalResponseHandler.createGenericResponse(hotelService.deleteHotel(id),null,HttpStatus.OK);
    }


}
