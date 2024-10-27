package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Isevice.Iservice;
import com.nt.model.TravelPlan;

@RestController
@RequestMapping("/travel/plan")
public class TravelController {
	@Autowired
private Iservice service;
	
	
	
	@PostMapping("/save")
	public ResponseEntity<?> registerTravel(@RequestBody TravelPlan plan) {
		
	
		return new ResponseEntity<String>(service.registerTravelPlan(plan),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/showCategories")
	public ResponseEntity<?> getAllCategories(){
		return new ResponseEntity<Map>(service.getAllPlanCategoriees(),HttpStatus.OK);
	}
	
	
	
	@GetMapping("/showTravel/{id}")
	public ResponseEntity<?> showTravel(@PathVariable int  id){
	return new ResponseEntity<TravelPlan>(service.showTravelByid(id),HttpStatus.OK);
	}
	
	
	@GetMapping("/showTravels")
	public ResponseEntity<?> showAllTravels(){
		return new ResponseEntity<List<TravelPlan>>(service.showAllTravels(),HttpStatus.OK);
	}
	
	
	@PostMapping("/update")
	public ResponseEntity<?>  updateTrvel(@RequestBody TravelPlan plan){
		return new ResponseEntity<String>(service.updateTravelPlan(plan),HttpStatus.CREATED);
	}
	
	@GetMapping("/delete/{id}")
	public String Delete(@PathVariable int  id) {
		
		return service.deleteTravelPlan(id);
	}
	

}

