package com.MedicineManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.model.Medicine;
import com.MedicineManagement.repository.MedicineRepository;

@Service
public class MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;

	public Medicine addMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}

	public List<Medicine> getAllMedicines() {
		return medicineRepository.findAll();
	}
	 public Optional<Medicine> getMedicineById(Long id) {
	        return medicineRepository.findById(id);
	    }
	 
	 public Medicine updateMedicine(Long id, Medicine updatedMedicine) {
	        return medicineRepository.findById(id)
	                .map(medicine -> {
	                    medicine.setName(updatedMedicine.getName());
	                    medicine.setColour(updatedMedicine.getColour());
	                    return medicineRepository.save(medicine);
	                })
	                .orElseThrow(() -> new RuntimeException("Medicine not found with id " + id));
	    }
	 
	 public void deleteMedicine(Long id) {
	        medicineRepository.deleteById(id);
	    }

}
