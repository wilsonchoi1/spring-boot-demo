package com.example.demo;

public class UserInfo {

	private int id;
	private String username;
	private String password;
	private String address;
	
	public static UserInfo createUser(int id){
		UserInfo user = new UserInfo();
		return user.setId(id);
	}
	
	public int getId() {
		return id;
	}

	public UserInfo setId(int id) {
		this.id = id;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public UserInfo setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public UserInfo setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public UserInfo setAddress(String address) {
		this.address = address;
		return this;
	}
}
