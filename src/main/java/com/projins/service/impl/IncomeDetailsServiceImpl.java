package com.projins.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.projins.dto.IncomeDetailsDto;
import com.projins.model.IncomeDetails;
import com.projins.repo.IncomeDetailsRepo;
import com.projins.service.IncomeDetailsService;

public class IncomeDetailsServiceImpl implements IncomeDetailsService {

	@Autowired
	IncomeDetailsRepo incomeDetailsRepo;

	@Override
	public String submitIncomeDetails(IncomeDetailsDto incomeDetailsDto) {
		IncomeDetails incomeDetails = new IncomeDetails();
		BeanUtils.copyProperties(incomeDetailsDto, incomeDetails);
		incomeDetailsRepo.save(incomeDetails);
		return incomeDetails.getCaseNo().toString();
	}

}
