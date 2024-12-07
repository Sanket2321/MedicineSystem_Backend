package com.MedicineManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.model.Medicine;
import com.MedicineManagement.service.MedicineService;

@RestController
@RequestMapping("/medicine")
public class MedicineController {
	@Autowired
	private MedicineService medicineService;
	
	
	// View List of Medicines
    @GetMapping("/show")
    public ResponseEntity<List<Medicine>> getAllMedicines() {
        List<Medicine> medicines = medicineService.getAllMedicines();
        return new ResponseEntity<>(medicines, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Medicine> addMedicine(@RequestBody Medicine medicine) {
        Medicine savedMedicine = medicineService.addMedicine(medicine);
        return new ResponseEntity<>(savedMedicine, HttpStatus.CREATED);
    }
    
    // Edit Medicine
    @PutMapping("/{id}")
    public ResponseEntity<Medicine> updateMedicine(@PathVariable Long id, @RequestBody Medicine updatedMedicine) {
        Medicine medicine = medicineService.updateMedicine(id, updatedMedicine);
        return new ResponseEntity<>(medicine, HttpStatus.OK);
    }
 // Delete Medicine
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMedicine(@PathVariable Long id) {
        medicineService.deleteMedicine(id);
        String successMessage = "Medicine with ID " + id + " deleted successfully.";
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
	
	

}
