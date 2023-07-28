package in.onesoft.bikes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class UserEmailEntity {
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	int userid;
	@Column
	String email;
	@Column
	String userpassword;
	@Column
	String username;
	 
	 public UserEmailEntity() {
		// TODO Auto-generated constructor stub
	}
	public UserEmailEntity(int id, int userid, String email, String userpassword, String username) {
		super();
		this.id = id;
		this.userid = userid;
		this.email = email;
		this.userpassword = userpassword;
		this.username = username;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	 
	 
	 
	 
	 
	
	
}
