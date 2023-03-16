package com.example1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
@Id
private Integer pid;
private String pname;
private Double pprice;
@Override
public String toString() {
	return "Products [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
}
public Products(Integer pid, String pname, Double pprice) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pprice = pprice;
}
public Products() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Double getPprice() {
	return pprice;
}
public void setPprice(Double pprice) {
	this.pprice = pprice;
}


}
