package com.stl.rechargeplanhistory.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Plan {

	
	private long planId;
	private String planName;
	private String planPrice;
	private String planValidity;
	
}
