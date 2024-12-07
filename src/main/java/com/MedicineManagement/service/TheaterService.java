package com.MedicineManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.model.Theater;
import com.MedicineManagement.repository.TheaterRepository;

@Service
public class TheaterService {
	  @Autowired
	    private TheaterRepository theaterRepository;

	    // Get all theaters
	    public List<Theater> getAllTheaters() {
	        return theaterRepository.findAll();
	    }
	    public  Theater selectTheater(Long id) {
	    	return theaterRepository.findById(id).orElseThrow(()->
          new IllegalArgumentException("Theater not found with ID"+id));
	    }
}
