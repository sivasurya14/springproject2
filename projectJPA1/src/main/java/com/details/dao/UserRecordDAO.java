package com.details.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.details.model.UserRecord;
import com.details.repository.UserRepository;

@Repository
public class UserRecordDAO {

	@Autowired
	UserRepository userRepository;

	public List<UserRecord> getAll() {
	List<UserRecord> list = userRepository.findAll();

		return list;
	}

	public void addUser(UserRecord ur) {
		userRepository.save(ur);

	}

	public Optional<UserRecord> findOneUser(int id) {
		Optional<UserRecord> oneData = userRepository.findById(id);
		return oneData;
	}

	public void updateUser(UserRecord ur) {
		userRepository.save(ur).getId();

	}

	public void deleteUser(int id) {

		userRepository.deleteById(id);
	}

}
