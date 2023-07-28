package com.mobiledetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobiledetails.model.Mobile;
import com.mobiledetails.service.MobileService;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	@Autowired
	MobileService mobileService;

	@PutMapping("/save")
	public String addDetails(@RequestBody Mobile mm) {
		mobileService.addDetails(mm);
		return "saved data successfully";
	}

	@GetMapping("/findall")
	public List<Mobile> findAll() {

		return mobileService.findAll();
	}

	@GetMapping("/findOne/{id}")
	public Optional<Mobile> findOne(@PathVariable int id) {

		return mobileService.findOne(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable int id) {
		mobileService.deleteDetails(id);
		return "delete data Successfully";
	}

	@PutMapping("/update")
	public String updateMobile(@RequestBody Mobile mm) {

		mobileService.updateMobile(mm);

		return "update data successfully";
	}

    @GetMapping("/mobile/count")
    public Long  counValues() {

        return mobileService.countValues();
    }
    @DeleteMapping("/mobile/deleteinbatch")
    public String deleteInBatch(List<Mobile> mob) {
    	
    	mobileService.deleteInBatch(mob);
    	
    	return "all data deleted successfuly";
    }
    
	
}