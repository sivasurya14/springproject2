package com.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Dao.EmployeDao;
import com.details.model.Employe;

@Service
public class EmployeService {
	@Autowired
	EmployeDao empDao;
	
	public void addDetails(Employe em) {
		empDao.addDetails(em);
		
	}
    public void updateDetails(Employe em,int doorno) {
    	
    	empDao.updateDetails(em,doorno);
    	
    }
    public List<Employe> findAll(){
    	List<Employe> li =empDao.findAll();
    	return li;
    	
    	
    }
    public Employe findOne(int doorno){
      return empDao.findOne( doorno);  
          }
    
    public void deleteDetails(int doorno) {
    	empDao.deleteDetails(doorno);
    }
}
