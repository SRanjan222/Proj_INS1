package com.projins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projins.dto.IncomeDetailsDto;
import com.projins.dto.PlanSectionDto;
import com.projins.service.IncomeDetailsService;

@RestController
public class IncomeDetailsController {
	@Autowired
	IncomeDetailsService incomeDetailsService;
	
	
	@PostMapping("/incomeDetails")
	public String save(@RequestBody IncomeDetailsDto incomeDetailsDto) {
		String save = incomeDetailsService.submitIncomeDetails(incomeDetailsDto);
		return "Successfully Submitted." +save;
	}
}
