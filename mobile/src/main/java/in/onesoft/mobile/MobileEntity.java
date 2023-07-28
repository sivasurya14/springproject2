package in.onesoft.mobile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="mobiles")
public class MobileEntity {
	
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
	@Column
	 private String brand;
	@Column
	 private String model;
	@Column
	 private String colur;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColur() {
		return colur;
	}
	public void setColur(String colur) {
		this.colur = colur;
	}
	
	
}
