package com.surya;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmployeController {
	@Autowired
	EmployeService es;
	@RequestMapping("/hi")
	String display() {
		return "index.html";
	}	
	@RequestMapping("/save")
	public String addDetails(@RequestBody EmployeeModel em) {
		es.addDetails(em);
		return "data added succussfully";
	}

	@PutMapping("/update/{employeId}")
	public String editDetails(@RequestBody EmployeeModel em, @PathVariable int employeId) {

		es.editDetails(em, employeId);

		return " data updated successfully";
	}

	@GetMapping("/findOne/{employeId}")
	public EmployeeModel findOneId(@PathVariable int employeId) {

	return es.findOneId(employeId);
	}

	@GetMapping("/findAll")

	public List<EmployeeModel> findAllDetails() {

		return es.findAllDetails();
	}
 @DeleteMapping ("/delete1/{employeId}")
	public String deleteDetails(@PathVariable int employeId) {
		return es.deleteDetails(employeId)+"delete successfully";}

 @DeleteMapping ("/delete2/{employeName}")
	public String delete1Details(@PathVariable String employeName) {
		return es.delete1Details(employeName)+"delete successfully";}

	
 
 

	}

