package com.MedicineManagement.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ScannedMedicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String medicineName;
	private int totalQuantity;
	private LocalDateTime dateTime;
	private String userName;
	private String medicineColor;
	private String status;
	private String patientName;
}
