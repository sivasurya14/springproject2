package com.details.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.details.model.UserRecord;
import com.details.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/findall")
	public List<UserRecord> findAll() {
		return userService.findAll();
	}

	@PostMapping("/save")
	public String addUser(@RequestBody UserRecord ur) {
		userService.addUser(ur);
		return "saved data successfully";

	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {

		userService.deleteUser(id);
		return " delete data successfully";
	}

	@GetMapping("/findone/{id}")
	public Optional<UserRecord> findOneUser(@PathVariable int id) {

		return userService.findOneUser(id);

	}

	@PutMapping("/update")
	public String updateUser(@RequestBody UserRecord ur) {
		userService.updateUser(ur);

		return "updated successfully";
	}

}
