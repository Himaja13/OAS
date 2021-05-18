package com.cg.oas.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login 
{
	@Id
	private String userId;
	private String password;
	private String role;
	public Login() {}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}
