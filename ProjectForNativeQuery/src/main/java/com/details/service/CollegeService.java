package com.details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.details.model.College;

@Service
public class CollegeService {
	@Autowired
	JpaRepository  jparep;
	
	public void addDetails(College cm) {
		jparep.save(cm);
		
	}
	
	

}
