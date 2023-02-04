package com.projins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projins.dto.IncomeDetailsDto;
import com.projins.dto.KidsDataRequest;
import com.projins.service.KidsDetailsService;

@RestController
public class KidsDetailsController {
	@Autowired
	KidsDetailsService kidsDetailsService;
	
	@PostMapping("/kidsDetails")
	public String save(@RequestBody KidsDataRequest kidsDataRequest) {
		String save = kidsDetailsService.submitKidsDetails(kidsDataRequest);
		return "Successfully Submitted." +save;
	}
}
