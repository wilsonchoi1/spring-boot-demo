package com.example.demo;

import java.net.InetAddress;

public class UserInfo {

	private int id;
	private String username;
	private String password;
	private String address;
	private String hostname;
	
	public static UserInfo createUser(int id){
		UserInfo user = new UserInfo();
		try {
			user.setHostname(InetAddress.getLocalHost().getHostName());
		} catch (Exception ex){
			ex.printStackTrace();
		}
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
	
	public void setHostname(String hostname){
		this.hostname = hostname;
	}
	
	public String getHostname(){
		return this.hostname;
	}
}
