package com.details.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.model.Student;

public interface StudentRepository extends JpaRepository <Student,Integer> {

}
