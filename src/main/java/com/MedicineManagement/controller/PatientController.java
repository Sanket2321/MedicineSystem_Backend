package com.MedicineManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.model.Patient;
import com.MedicineManagement.service.PatientService;

@RestController
@RequestMapping("/Patient")
public class PatientController {
	@Autowired
	private PatientService patientService;
    @GetMapping("/show")
	List<Patient> getAllPatient() {
		return patientService.getAllPatient();
	}
   @PostMapping("/add")
//	public Patient addPatient(@RequestBody Patient patient) {
//     return patientService.addPatient(patient);
//	}
   public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
	    Patient savedPatient = patientService.addPatient(patient);
	    return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);
	}

}
