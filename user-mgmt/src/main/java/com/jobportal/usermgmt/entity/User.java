package com.jobportal.usermgmt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user")
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_type")
	private String user_type;
	
	public int getId() {
		return this.id;
	}
	
	public String getUserType() {
		return this.user_type;
	}
}
