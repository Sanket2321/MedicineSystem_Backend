package com.MedicineManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.model.ScannedMedicine;
import com.MedicineManagement.service.ScannedMedicineService;
@RestController
@RequestMapping("/scanned-medicines")
public class ScannedMedicineController {
	@Autowired
	private ScannedMedicineService scannedMedicineService;
  @PostMapping("/add")
  
  public ResponseEntity<String> addScannedMedicine(@RequestBody  ScannedMedicine scannedMedicine){
	          scannedMedicineService.addScannedMedicine(scannedMedicine);
  
  return new ResponseEntity<>("scanned medicine data added  sucessfully",HttpStatus.CREATED);
  }
  
  
  
  
  

}
