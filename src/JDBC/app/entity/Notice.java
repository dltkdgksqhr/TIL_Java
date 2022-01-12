package JDBC.app.entity;

import java.util.Date;

public class Notice {
	private int id;
	private String title;
	private String wirterId;
	private Date regDate; 
	private String content;
	private int hit;
	
	
	public Notice() {
		
	}
	
	

	public Notice(int id, String title, String wirterId, Date regDate, String content, int hit) {
		super();
		this.id = id;
		this.title = title;
		this.wirterId = wirterId;
		this.regDate = regDate;
		this.content = content;
		this.hit = hit;
		
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWirterId() {
		return wirterId;
	}
	public void setWirterId(String wirterId) {
		this.wirterId = wirterId;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}

	
	
}
