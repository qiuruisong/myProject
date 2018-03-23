package com.qrs.springmvc.bean;

public class User {
	String bh;
	String name;
	String password;
	int age;
	int sex;
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public User(String bh, String name, String password, int age, int sex) {
		super();
		this.bh = bh;
		this.name = name;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}
	public User() {
		super();
	}
	
}
