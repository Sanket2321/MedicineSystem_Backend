package com.MedicineManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.model.Patient;
import com.MedicineManagement.repository.PatientRepository;
@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}

	public Patient addPatient(Patient patient) {
		return patientRepository.save(patient);
	}

}
