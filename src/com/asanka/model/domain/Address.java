/**
 * 
 */
package com.asanka.model.domain;

import java.io.Serializable;

/**
 * @author Asanka Siriwardena
 *
 */
public class Address implements Serializable {

	private static final long serialVersionUID = 4661276254768599438L;
	
	private String country;
	private String city;
	private String street;
	private Integer postalCode;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
}
