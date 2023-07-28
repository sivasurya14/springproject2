package com.details.controller;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.details.Service.StudentService;
import com.details.model.Student;

@RestController
@RequestMapping("/map")
public class StudentController {
	
	Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentService std;

	@PostMapping("/save")
	public String addDetails(@RequestBody Student sm) {
		std.addDetails(sm);
		log.info("from Save method");
		log.error("this is complete");
		return "saved data successfully";

	}

	@PutMapping("/update/{id}")
	public String updateDetails(@RequestBody Student sm) {
		std.updateDetails(sm);
		log.info("from update");
		return "update data successfully";
	}

	@GetMapping("/findall")
	public List<Student> findAll() {
		log.info("from all");
		List<Student> al = std.findAll();
		return al;
	}

	@GetMapping("/findone")
	public Optional<Student> findOne(@PathVariable int id) {
		log.info("from one");
		return std.findOne(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable int id) {
		log.info("from Delete");
		std.deleteDetails(id);
		return "delete data successfully";

	}
}
