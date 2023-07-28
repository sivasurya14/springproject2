package in.onesoft.bikes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserExperienceEntity {
	
	@Id    @GeneratedValue(strategy = GenerationType.IDENTITY)

	int id ;
	@Column
	int userid;
	@Column
	String companyname;
	@Column
	int fromyear ;
	@Column
	int toyear;
	  
	public UserExperienceEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	public UserExperienceEntity(int id, int userid, String companyname, int fromyear, int toyear) {
		super();
		this.id = id;
		this.userid = userid;
		this.companyname = companyname;
		this.fromyear = fromyear;
		this.toyear = toyear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getFromyear() {
		return fromyear;
	}
	public void setFromyear(int fromyear) {
		this.fromyear = fromyear;
	}
	public int getToyear() {
		return toyear;
	}
	public void setToyear(int toyear) {
		this.toyear = toyear;
	}
	
	
	
	
	
}
