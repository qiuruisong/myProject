package com.qrs.springmvc.bean;

public class User {
    private String bh;

    private String name;

    private String password;

    private Integer age;

    private Integer sex;

    private Integer nYx;

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh == null ? null : bh.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getnYx() {
        return nYx;
    }

    public void setnYx(Integer nYx) {
        this.nYx = nYx;
    }

	public User(String bh, String name, String password, Integer age,
			Integer sex, Integer nYx) {
		super();
		this.bh = bh;
		this.name = name;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.nYx = nYx;
	}

	public User() {
		super();
	}
    
}