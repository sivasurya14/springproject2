package com.details.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.dao.UserRecordDAO;
import com.details.model.UserRecord;
import com.details.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRecordDAO userRecordDAO;
	
	public List<UserRecord> findAll() {
		List<UserRecord> li = userRecordDAO.getAll();
		return li;
	}

	public void deleteUser(int id) {
		userRecordDAO.deleteUser(id);		
	}

	public Optional<UserRecord> findOneUser(int id) {
		
		return userRecordDAO.findOneUser(id);
	}

	public void addUser(UserRecord ur) {
		userRecordDAO.addUser(ur);
		
	}

	public void updateUser(UserRecord ur) {
		userRecordDAO.updateUser(ur);
		
	}
}
