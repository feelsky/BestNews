package com.me.news.model;

public class User {
	public User(){
		
	}
	public User(String name, String password, String nickName, String email) {
		super();
		this.name = name;
		this.password = password;
		this.nickName = nickName;
		this.email = email;
	}
	private String name;
	private String password;
	private String nickName;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
