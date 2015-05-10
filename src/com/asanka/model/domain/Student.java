/**
 * 
 */
package com.asanka.model.domain;

import java.io.Serializable;

/**
 * @author Asanka Siriwardena
 *
 */
public class Student implements Serializable {

	private static final long serialVersionUID = -2594235456948306372L;
	
	private String firstname;
	private String lastname;
	
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
}
