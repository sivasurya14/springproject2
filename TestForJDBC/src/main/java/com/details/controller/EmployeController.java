package com.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.details.model.Employe;
import com.details.service.EmployeService;

@RestController
@RequestMapping("/model")
public class EmployeController {
	@Autowired
	EmployeService empService;

	@PostMapping("/save")
	public String addDetails(@RequestBody Employe em) {
		empService.addDetails(em);
		return "saved data successfully";

	}

	@PutMapping("/update/{doorno}")
	public String updateDetails(@RequestBody Employe em, @PathVariable int doorno) {
		empService.updateDetails(em, doorno);

		return "update data successfully";

	}

	@GetMapping("/findAll")
	public List<Employe> findAll() {
		return empService.findAll();

	}

	@DeleteMapping("/delete/{doorno}")
	public String deleteDetails(@PathVariable int doorno) {
		empService.deleteDetails(doorno);
		return "delete data successfully";
	}

	@GetMapping("/findone/{doorno}")
	public Employe findOne(@PathVariable int doorno) {
		return empService.findOne(doorno);

	}
}
