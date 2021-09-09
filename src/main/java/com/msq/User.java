package com.msq;

public class User {
	private int id;
	private String name;
	private String pasword;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String pasword) {
		super();
		this.id = id;
		this.name = name;
		this.pasword = pasword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	

}
