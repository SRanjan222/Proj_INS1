package com.projins.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.projins.dto.KidDetailsDto;
import com.projins.dto.KidsDataRequest;
import com.projins.model.KidsDetails;
import com.projins.repo.KidsDetailsRepo;
import com.projins.service.KidsDetailsService;

public class KidsDetailsServiceImpl implements KidsDetailsService {
	@Autowired
	KidsDetailsRepo kidsDetailsRepo;

	@Override
	public String submitKidsDetails(KidsDataRequest kidsDataRequest) {
		KidsDetails kids = new KidsDetails();
		long caseNo = kidsDataRequest.getCaseNo();
		String caseNoValue = String.valueOf(caseNo);
		for (KidDetailsDto kidsDetailsDto : kidsDataRequest.kidsList) {
			BeanUtils.copyProperties(kidsDataRequest, kids);
			kids.setCaseNo(caseNo);
			kidsDetailsRepo.save(kids);
		}

		return caseNoValue;
	}

}
