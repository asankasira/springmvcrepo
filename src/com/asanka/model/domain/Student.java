/**
 * 
 */
package com.asanka.model.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Asanka Siriwardena
 *
 */
public class Student implements Serializable {

	private static final long serialVersionUID = -2594235456948306372L;
	
	private String firstname;
	private String lastname;
	private String studentHobby;
	
	private Long studentMobile;
	private Date dateOfBirth;
	private List<String> studentSkills;
	
	//Custom type auto data binding
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public List<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
}
