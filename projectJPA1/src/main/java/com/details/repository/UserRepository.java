package com.details.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import com.details.model.UserRecord;

public interface UserRepository extends JpaRepository <UserRecord,Integer> {
	
}
