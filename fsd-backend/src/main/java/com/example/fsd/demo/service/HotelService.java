package com.example.fsd.demo.service;


import com.example.fsd.demo.entity.Hotel;
import com.example.fsd.demo.repository.HotelRepository;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {


    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        List<Hotel> hotelList = hotelRepository.findAll();
        return hotelList;
    }


    public String addHotel(Hotel hotel){
        hotelRepository.save(hotel);
        return "Added Successfully";
    }

    public Hotel updateHotel(long hotelId,Hotel updatedHotel) {

        updatedHotel.setId(hotelId);
        Optional<Hotel> existingHotel = hotelRepository.findById(hotelId);
        BeanUtils.copyProperties(updatedHotel,existingHotel.get());
        return hotelRepository.save(existingHotel.get());
    }

    public String deleteHotel(long id) {
        hotelRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
