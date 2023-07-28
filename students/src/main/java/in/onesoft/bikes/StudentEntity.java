package in.onesoft.bikes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="studentdet")
public class StudentEntity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	@Column
	private String name;
	@Column
	private String school;
	@Column
	private int grade;
	public StudentEntity() {
		
	}
	public StudentEntity(int id ,String name,String school,int grade) {
		this.id=id;
		this.name=name;
		this.school=school;
		this.grade=grade;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
