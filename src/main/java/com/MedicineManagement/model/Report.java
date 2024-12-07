package com.MedicineManagement.model;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Report {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String medicineName;
    private int totalQuantity;
    private int usedQuantity;
    private int discardedQuantity;
    private Date date;
    private String time;
    private String userName;
    private String medicineColor;
    private String status;
    private String patientName;
	
	

}
