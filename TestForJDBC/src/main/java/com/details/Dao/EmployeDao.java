package com.details.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.details.model.Employe;

@Repository

public class EmployeDao {
	@Autowired
	JdbcTemplate temp;
	public void addDetails(Employe em) {
		temp.update("INSERT INTO emp (doorno,name,street,city)values(?,?,?,?)",em.getDoorno(),em.getName(),em.getStreet(),em.getCity());		
	}
    public void updateDetails(Employe em,int doorno) {
    	temp.update("UPDATE emp set name=?,city=?,street=? WHERE doorno=?",em.getName(),em.getStreet(),em.getCity(),doorno);
    	System.out.println("update data successfully");
    }
  public Employe findOne(int doorno) {
    	Employe em1 =(Employe) temp.queryForObject(" select * from emp where doorno=?", new Object[] {doorno}, new BeanPropertyRowMapper<Employe>(Employe.class)); 
    	return em1;
    }
    public List<Employe> findAll(){
    	List<Employe> al=temp.query("SELECT * FROM emp", new BeanPropertyRowMapper(Employe.class));
    	return al;	
    }
    public int deleteDetails(int doorno) {
    	return temp.update("DELETE FROM emp WHERE doorno=?",doorno);	
    }
}
