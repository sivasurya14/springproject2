package com.details.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.dao.StudentDao;
import com.details.model.Student;

@Service
public class StudentService {
@Autowired
StudentDao rep;

public void addDetails(Student sm) {
	rep.addDetails(sm);
	
}
	public void updateDetails(Student sm) {
		rep.updateDetails(sm);
	}
    public List<Student> findAll(){
    	List<Student> al=rep.findAll();
    	return al;
    }
    public Optional<Student> findOne(int id){
    	  Optional<Student> li =rep.findOne(id);
          return li;
           
    }
    public void deleteDetails(int id) {
    	rep.deleteDetails(id);
    }
}
