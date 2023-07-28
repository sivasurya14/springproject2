package in.onesoft.filesupload;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="userqualification")
public class QualificationEntity {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	int userid;
	@Column
	String qualification;
	@Column
	int fromyear;
	@Column
	int toyear;
	@Column
	String boarduniversity;
	@Column
	int totalmarks;
	@Column
	int outofmarks;
	@Column
	String percentage;
	
	
     QualificationEntity() {
	
    	 
	}
	public QualificationEntity(int id, int userid, String qualification, int fromyear, int toyear,
			String boarduniversity, int totalmarks, int outofmarks, String percentage) {
		super();
		this.id = id;
		this.userid = userid;
		this.qualification = qualification;
		this.fromyear = fromyear;
		this.toyear = toyear;
		this.boarduniversity = boarduniversity;
		this.totalmarks = totalmarks;
		this.outofmarks = outofmarks;
		this.percentage = percentage;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
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
	public String getBoarduniversity() {
		return boarduniversity;
	}
	public void setBoarduniversity(String boarduniversity) {
		this.boarduniversity = boarduniversity;
	}
	public int getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	public int getOutofmarks() {
		return outofmarks;
	}
	public void setOutofmarks(int outofmarks) {
		this.outofmarks = outofmarks;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
}
