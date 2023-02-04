package com.projins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projins.dto.PlanSectionDto;
import com.projins.service.PlanSectionService;

@RestController
public class PlanSectionController {
	
	@Autowired
	PlanSectionService planSectionService;
	
	
	@GetMapping("/plan/{appId}")
	public String createCase(@PathVariable int appId) {
		String createCase = planSectionService.createCase(appId);
		return createCase;
	}
	
	@PostMapping("/plan")
	public String submitPlan(@RequestBody PlanSectionDto planSectionDto) {
		String submitPlan = planSectionService.submitPlan(planSectionDto);
		return "Successfully Submitted." +submitPlan;
	}
	

}
