package com.MedicineManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.model.Report;
import com.MedicineManagement.repository.ReportRepository;

@Service
public class ReportService {
	@Autowired
	private ReportRepository reportRepository;

	public List<Report> getAllReport() {
		return reportRepository.findAll();

	}
	 public Report createReport(Report report) {
		 return reportRepository.save(report);
		 
	 }
}
