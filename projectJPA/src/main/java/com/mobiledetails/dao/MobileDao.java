package com.mobiledetails.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobiledetails.model.Mobile;
import com.mobiledetails.repository.MobileRepository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mobileRepository;

	public void addDetails(Mobile mm) {
		mobileRepository.save(mm);
	}

	public List<Mobile> findAll() {
		List<Mobile> li = mobileRepository.findAll();
		return li;
	}

	public Optional<Mobile> findOne(int id) {
		Optional<Mobile> al = mobileRepository.findById(id);
		return al;
	}

	public void deleteDetails(int id) {
		mobileRepository.deleteById(id);

	}
    public void deleteInBatch(List<Mobile> mob) {
    	  mobileRepository.deleteAllInBatch(mob);
    	}
	
	public void updateMobile(Mobile mm) {
		mobileRepository.save(mm).getId();
	}
	
	public Long countValues() {
		 return mobileRepository.count();
		
	}

}
