package com.example1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class University {
@Id	
private int code;
private String cec;
private String mec;
private String civ;
private String ele;
public University() {
	super();
	// TODO Auto-generated constructor stub
}
public University(int code, String cec, String mec, String civ, String ele) {
	super();
	this.code = code;
	this.cec = cec;
	this.mec = mec;
	this.civ = civ;
	this.ele = ele;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getCec() {
	return cec;
}
public void setCec(String cec) {
	this.cec = cec;
}
public String getMec() {
	return mec;
}
public void setMec(String mec) {
	this.mec = mec;
}
public String getCiv() {
	return civ;
}
public void setCiv(String civ) {
	this.civ = civ;
}
public String getEle() {
	return ele;
}
public void setEle(String ele) {
	this.ele = ele;
}

}
