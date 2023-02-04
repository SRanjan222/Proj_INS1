package com.projins.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.projins.dto.EducationDetailsDto;
import com.projins.model.EducationDetails;
import com.projins.repo.EducationDetailsRepo;
import com.projins.service.EducationDetailsService;

public class EducationDetailsServiceImpl implements EducationDetailsService {
	@Autowired
	EducationDetailsRepo educationDetailsRepo;

	@Override
	public String submitEducationDetails(EducationDetailsDto educationDetailsDto) {
		EducationDetails educationDetails = new EducationDetails();
		BeanUtils.copyProperties(educationDetailsDto, educationDetails);
		educationDetailsRepo.save(educationDetails);
		return educationDetails.getCaseNo().toString();
	}

}
