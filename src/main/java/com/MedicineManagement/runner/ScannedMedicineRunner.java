package com.MedicineManagement.runner;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.MedicineManagement.model.ScannedMedicine;
import com.MedicineManagement.repository.ScannedMedicineRepository;

import lombok.Data;

@Component
@Data
public class ScannedMedicineRunner implements ApplicationRunner {
	@Autowired
	private ScannedMedicineRepository scannedMedicineRepository;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
	ScannedMedicine scannedMedicine = new ScannedMedicine();
    scannedMedicine.setMedicineName("Paracetamol");
    scannedMedicine.setTotalQuantity(100);
    scannedMedicine.setDateTime(LocalDateTime.of(2024, 12, 6, 15, 30));
    scannedMedicine.setUserName("John Doe");
    scannedMedicine.setMedicineColor("White");
    scannedMedicine.setStatus("Available");
    scannedMedicine.setPatientName("Jane Smith");

    // Add the scanned medicine data
     
         List< ScannedMedicine> list=Arrays.asList(scannedMedicine);
          scannedMedicineRepository.saveAll(list);
         
    System.out.println("Scanned medicine data added successfully!");
      
		
	}

}
