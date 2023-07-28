package com.mobiledetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

		return mobileDao.findOne(id);
	}

	public void deleteDetails(int id) {

		mobileDao.deleteDetails(id);
	}

	public void updateMobile(Mobile mm) {
		mobileDao.updateMobile(mm);
	}
}