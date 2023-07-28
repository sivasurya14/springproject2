package com.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.details.model.College;
import com.details.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {
@Autowired
CollegeService clgService;

 @PutMapping("/add")
 public String  addDetails(@RequestBody College cm) {
	 clgService.addDeatails(cm);
	  return "saved data successfully";
	  
 }
 @GetMapping("/findAll")
  public List<College> findAll(){
	 List<College> al=clgService.findAll();
	 return al;
	 
 }
 @DeleteMapping("/delete/{id}")
 
 public String deleteDetails(@PathVariable int id) {
	 clgService.deleteDetails(id);
	 
	 return "data deleted successfully";
	 
 }
 
	
}
