package com.stl.rechargeplanhistory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stl.rechargeplanhistory.entity.RechargeHistory;
import com.stl.rechargeplanhistory.repo.HistoryRepo;


@RestController
@RequestMapping("/history")
public class HistoryController {

   @Autowired
   private HistoryRepo historyrepo;
   
   @GetMapping("/{mobNo}")
   public ResponseEntity<List<RechargeHistory>> getPlan(@PathVariable String mobNo){
	   List<RechargeHistory> history=historyrepo.findByContactNumber(mobNo);
		return ResponseEntity.ok(history);
   }
   
	@PostMapping("/add")
	public ResponseEntity<RechargeHistory> addPlan(@RequestBody RechargeHistory history) {
	  historyrepo.save(history);
		return ResponseEntity.ok(history);
}
}
