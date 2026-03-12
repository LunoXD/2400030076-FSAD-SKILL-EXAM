package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.repository.HotelRepository;
import com.klef.fsad.exam.model.Hotel;

@Service
public class HotelService {

    @Autowired
    HotelRepository repo;

    public Hotel addHotel(Hotel h){
        return repo.save(h);
    }

    public Hotel updateHotel(Hotel h){
        return repo.save(h);
    }

}