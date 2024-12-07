package com.MedicineManagement.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.MedicineManagement.model.Patient;
import com.MedicineManagement.repository.PatientRepository;

import lombok.Data;

@Component
@Data
public class PatientDataRunner implements ApplicationRunner {
	@Autowired
	private PatientRepository patientRepository;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Patient p1 = new Patient();
		p1.setPatientName("Sanket");
		p1.setDob(LocalDate.of(2000, 1, 1));
		p1.setNhsNumber("NHS3445");
		p1.setHospitalNumber("HOS44404");

		Patient p2 = new Patient();
		p2.setPatientName("Jane Smith");
		p2.setDob(LocalDate.of(1985, 6, 15));
		p2.setNhsNumber("NHS654321");
		p2.setHospitalNumber("HOSP98765");
		
		
		List<Patient> patient=Arrays.asList(p1,p2);
		patientRepository.saveAll(patient);
	}

}
