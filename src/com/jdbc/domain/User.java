package com.jdbc.domain;

import java.util.ArrayList;

public class User {
	private int userNum;
	private String id;
	private String password;
	private String name;
	private int gender;
	private String birth;
	private int role;
	private ArrayList<Evaluation> userEval;
	
	public User() {
		super();
	}
	
	public User(int userNum, String id, String password, String name, int gender, String birth, int role) {
		super();
		this.userNum = userNum;
		this.id = id;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.role = role;
	}
	
	public User(String id, String password, String name, int gender, String birth, int role) {
		super();
		
		this.id = id;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.role = role;
	}
	

	
	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	public ArrayList<Evaluation> getUserEval() {
		return userEval;
	}

	public void setUserEval(ArrayList<Evaluation> userEval) {
		this.userEval = userEval;
	}

	@Override
	public String toString() {
		return "User [userNum=" + userNum + ", id=" + id + ", password=" + password + ", name=" + name + ", gender="
				+ gender + ", birth=" + birth + ", role=" + role + "]";
	}
	
}
