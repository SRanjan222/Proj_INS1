package com.projins.service;

import com.projins.dto.PlanSectionDto;

public interface PlanSectionService {
	public String createCase(int appId);
	public String submitPlan(PlanSectionDto planSectionDto);

}
