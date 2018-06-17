package com.ghag.rnd.swagger.simple;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.google.gson.annotations.SerializedName;



@Entity
//@Table(name = "TASK")
public class Task {
	@Id
	@GeneratedValue
	@SerializedName("Id")
	private int id;
	
	//@Column(name = "description")
	@SerializedName("Description")
	private String description;
	
	//@Column(name = "target_date")
	@Temporal(TemporalType.TIMESTAMP)
	@SerializedName("TargetDate")
	private Date targetDate;
	
	//@Column(name = "is_done")
	@SerializedName("IsDone")
	private String isDone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public String getIsDone() {
		return isDone;
	}

	public void setIsDone(String isDone) {
		this.isDone = isDone;
	}
	
	
	
}