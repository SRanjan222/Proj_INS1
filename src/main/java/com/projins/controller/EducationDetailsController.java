package com.projins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projins.dto.EducationDetailsDto;
import com.projins.dto.IncomeDetailsDto;
import com.projins.service.EducationDetailsService;
import com.projins.service.IncomeDetailsService;

@RestController
public class EducationDetailsController {
	@Autowired
	EducationDetailsService educationDetailsService;
	
	
	@PostMapping("/educationDetails")
	public String save(@RequestBody EducationDetailsDto educationDetailsDto) {
		String save = educationDetailsService.submitEducationDetails(educationDetailsDto);
		return "Successfully Submitted." + save;
	}
}
