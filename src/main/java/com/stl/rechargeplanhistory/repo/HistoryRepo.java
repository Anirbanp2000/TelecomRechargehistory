package com.stl.rechargeplanhistory.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stl.rechargeplanhistory.entity.RechargeHistory;

public interface HistoryRepo extends JpaRepository<RechargeHistory, Long>{

	List<RechargeHistory> findByContactNumber(String contactNumber);
}
