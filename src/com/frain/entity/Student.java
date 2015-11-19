package com.frain.entity;

import java.util.LinkedList;

public class Student {
	
	String sex;
	int age;
	String Id;
	String password;
	String major;
	LinkedList<Books> booksList;
	
	
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public LinkedList<Books> getBooksList() {
		return booksList;
	}
	public void setBooksList(LinkedList<Books> booksList) {
		this.booksList = booksList;
	}
	
	
	
	
	
}
