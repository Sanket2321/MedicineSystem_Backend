package com.MedicineManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.model.Report;
import com.MedicineManagement.service.ReportService;

@RestController
@RequestMapping("/report")
public class ReportController {
	@Autowired
	private ReportService reportService;

	@GetMapping("/show")
	public List<Report> getAllReports() {
		return reportService.getAllReport();
	}

	@PostMapping("/create")
	public Report createReport(@RequestBody Report report) {
		return reportService.createReport(report);
	}

}
