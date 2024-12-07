package com.MedicineManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.model.Theater;
import com.MedicineManagement.repository.TheaterRepository;
import com.MedicineManagement.service.TheaterService;

@RestController
@RequestMapping("Theater")
public class TheaterController {
  @Autowired
  private TheaterService theaterService;
  @GetMapping
  public List<Theater> getAllTheaters() {
      return theaterService. getAllTheaters();
  }
  @PostMapping("/select")
  public Theater selectTheater(@RequestBody Map<String,Long> requestBody )  
  //suppose we want to send data throuh json the we need the following steps 
  {
	   Long theaterId= requestBody.get("id");
	    //Long theaterId=request.getId();	
	     Theater selectedTheater =theaterService.selectTheater(theaterId);
	     return selectedTheater;
	  //return theaterService.selectTheater(theaterId);
  }
}
