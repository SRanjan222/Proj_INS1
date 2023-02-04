package com.projins.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projins.dto.ARApiDto;

@FeignClient(name="ar-api")
public interface FiegnServiceUtil {
	
	@GetMapping("/citizen/{appId}")
	public ARApiDto getCitizenById(@PathVariable int appId);

}
