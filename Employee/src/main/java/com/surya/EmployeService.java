package com.surya;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {
	
	@Autowired
	EmployeDao ed;
	
	public void addDetails(EmployeeModel em) {
		ed.addDetails(em);}

	public void editDetails(EmployeeModel em, int employeId) {
		
		ed.editDetails(em,employeId);}
	
	public EmployeeModel findOneId(int employeId) {
		
		 return ed.findOneId(employeId);}
	
	public List <EmployeeModel>findAllDetails() {
		return ed.findAllDetails();}
	
	public int deleteDetails(int employeId) {
		
		return ed.deleteDetails(employeId);}


	public int delete1Details(String employeName) {
		
		return ed.delete1Details(employeName);}
		
	
		
	}
			


