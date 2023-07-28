package in.onesoft.shirts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="shirt")
public class ShirtsEntity {
   @Id    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int modelid;
   @Column
	private String colour;
   @Column
	private char size;
   public ShirtsEntity() {
	   
   }	
public ShirtsEntity(int modelid, String colour, char size) {
	this.modelid=modelid;
	this.colour=colour;
	this.size=size;
}
public int getModelid() {
	return modelid;
}
public void setModelid(int modelid) {
	this.modelid = modelid;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public char getSize() {
	return size;
}
public void setSize(char size) {
	this.size = size;
}
}
		