package com.stl.rechargeplanhistory.entity;

import com.stl.rechargeplanhistory.dto.Plan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RechargeHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String planName;
	private String planPrice;
	private String planValidity;
	private String contactNumber;
	
	
	
	@Transient
	Plan plan;
	
}
