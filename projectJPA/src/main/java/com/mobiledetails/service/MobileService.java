package com.mobiledetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.mobiledetails.dao.MobileDao;
import com.mobiledetails.model.Mobile;

@Service
public class MobileService {
	@Autowired
	MobileDao mobileDao;

	public void addDetails(Mobile mm) {
		mobileDao.addDetails(mm);
	}

	public List<Mobile> findAll() {
		List<Mobile> al = mobileDao.findAll();
		return al;
	}

	public Optional<Mobile> findOne(int id) {

		   Optional<Mobile> sd = mobileDao.findOne(id);
		   return sd;
	}

	public void deleteDetails(int id) {

		mobileDao.deleteDetails(id);
	}

	public void updateMobile(Mobile mm) {
		mobileDao.updateMobile(mm);
	}

   
    public Long countValues() {

        return mobileDao.countValues();
    }
   
    public void deleteInBatch(List<Mobile> mob) {
    	
    	 mobileDao.deleteInBatch(mob);
    }

		
	}
