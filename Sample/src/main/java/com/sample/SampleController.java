package com.sample;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	SampleRepository sample;

	@GetMapping("/map")
	public String getMessage() {
		return "sample message ";
	}
	@GetMapping("/findall")
	public List<SampleEntity> findAll() {
		List<SampleEntity> list = sample.findAll();
		return list;
	}
	@GetMapping("/findbyauth")
	public List<SampleEntity> findAllbyprice() {
		List<SampleEntity> list =sample.findAll();
	 return list.stream().filter(x->x.getPrice()>200).collect(Collectors.toList());
	  // return list.stream().filter(x->x.getAuthor().equalsIgnoreCase("siva")).collect(Collectors.toList());
	}	
}