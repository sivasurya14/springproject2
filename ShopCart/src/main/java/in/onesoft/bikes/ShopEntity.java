package in.onesoft.bikes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="productdet")
public class ShopEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String brand;
	@Column
	private String category;
	@Column
	private String material;
	@Column
	private String colour;
	@Column
	private String type;
	@Column
	private String price;
	@Column
	private String model;
	@Column
	private String volume;
	@Column
	private String sub_category;
	@Column
	private String descrip;
	@Column
	private String warranty;
	@Column
	private int cid;
	@Column
	private int scid;
	public ShopEntity() {
		// TODO Auto-generated constructor stub
	}
	public ShopEntity(int id, String brand, String category, String material, String colour, String type, String price,
			String model, String volume, String sub_category,String descrip ,String waranty,int cid,int scid) {
		this.id = id;
		this.brand = brand;
		this.category = category;
		this.material = material;
		this.colour = colour;
		this.type = type;
		this.price = price;
		this.model = model;
		this.volume = volume;
		this.sub_category = sub_category;
		this.warranty=waranty;
		this.descrip=descrip;
		this.cid=cid;
		this.scid=scid;
	

	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
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
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getsub_category() {
		return sub_category;
	}
	public void setsub_category(String sub_category) {

		this.sub_category = sub_category;
		

	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getScid() {
		return scid;
	}
	public void setScid(int scid) {
		this.scid = scid;
	}
}
