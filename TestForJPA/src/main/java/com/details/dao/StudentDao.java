package com.details.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.details.model.Student;
import com.details.repository.StudentRepository;

@Repository
public class StudentDao {
@Autowired
StudentRepository sd;


    public void addDetails(Student sm) {
    	sd.save(sm);
    }
   public void updateDetails(Student sm) {
	   sd.save(sm).getId();
   }
   public List<Student> findAll(){
	   List<Student> li=sd.findAll();
	  return li;
	   
   }
   public Optional<Student> findOne(int id){
	   Optional<Student> ss=sd.findById(id);
	   return ss;
   }
   public void deleteDetails(int id) {
   sd.deleteById(id);
}
}
