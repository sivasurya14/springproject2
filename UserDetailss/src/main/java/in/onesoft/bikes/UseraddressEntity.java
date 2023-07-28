package in.onesoft.bikes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="useraddress")
public class UseraddressEntity {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	int id;
     	@Column
	 	int doorno;
     	@Column
	 	String street;
     	@Column
	 	String city;
     	@Column
	 	String state;
     	@Column
	 	int pincode;
     	@Column
	 	int userid;
     	
     	UseraddressEntity(){	
     	}
    public UseraddressEntity(int id, int doorno, String street, String city, String state, int pincode) {
			this.id = id;
			this.doorno = doorno;
			this.street = street;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			this.userid = userid;
			
			}
    	public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getDoorno() {
			return doorno;
		}
		public void setDoorno(int doorno) {
			this.doorno = doorno;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
}