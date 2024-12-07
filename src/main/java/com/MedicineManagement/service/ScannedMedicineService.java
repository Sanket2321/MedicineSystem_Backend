package com.MedicineManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.model.ScannedMedicine;
import com.MedicineManagement.repository.ScannedMedicineRepository;

@Service
public class ScannedMedicineService {
	@Autowired
	private ScannedMedicineRepository scannedMedicineRepository;

	public void addScannedMedicine(ScannedMedicine scannedMedicine) {
		// Save the scanned medicine data to the database
		scannedMedicineRepository.save(scannedMedicine);
	}
	
	
/*	Complete Flow Diagram
	Client → Sends POST request with JSON payload.
	Controller → Maps JSON to ScannedMedicine and calls the service layer.
	Service → Passes the data to the repository for saving.
	Repository → Interacts with the database to save the scanned medicine data.
	Database → Stores the data and generates an ID.
	Controller → Returns a success response to the client.*/


}
