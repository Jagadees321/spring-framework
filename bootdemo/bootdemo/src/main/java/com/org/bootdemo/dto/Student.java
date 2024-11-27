package com.org.bootdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
   private int id;
   private String name;
   private int age;
   private long moblienum;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getMoblienum() {
	return moblienum;
}
public void setMoblienum(long moblienum) {
	this.moblienum = moblienum;
}
   
   
}
