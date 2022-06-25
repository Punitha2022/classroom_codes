package com.example.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String firstname;
private String lastname;
private String email;
private Date dob;
@ManyToOne(cascade = CascadeType.PERSIST)
@JoinColumn(name = "dept_id")
private Department department;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "salary_accno")
private BankAccount salaryAccount;

public BankAccount getSalaryAccount() {
	return salaryAccount;
}
public void setSalaryAccount(BankAccount salaryAccount) {
	this.salaryAccount = salaryAccount;
}
public Employee() {
	super();
}
public Employee(String firstname, String lastname, String email, Date dob) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.dob = dob;
}
public Employee(long id, String firstname, String lastname, String email, Date dob) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.dob = dob;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}

public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return String.format("ID:%d, Firstname %s , lastname %s , email %s ,dob %s", this.id,this.firstname,this.lastname,this.email,this.dob);
}
}
