package com.MedicineManagement.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.MedicineManagement.model.Medicine;
import com.MedicineManagement.repository.MedicineRepository;

import lombok.Data;

@Component
@Data
public class MedicineDataRunner implements ApplicationRunner {
	@Autowired
	private MedicineRepository medicineRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Medicine m = new Medicine();
		
		m.setName("Paracetemol");
		m.setColour("pink");

		Medicine m1 = new Medicine();
		
		m1.setName("rapix");
		m1.setColour("blue");
		Medicine m2 = new Medicine();
		
		m2.setName("cyfra");
		m2.setColour("black");
		List<Medicine> list = Arrays.asList(m, m1, m2);
		medicineRepository.saveAll(list);

	}

}
