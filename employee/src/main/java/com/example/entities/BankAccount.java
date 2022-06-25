package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int accno;
private String branchname;
private String location;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getBranchname() {
	return branchname;
}
public void setBranchname(String branchname) {
	this.branchname = branchname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
