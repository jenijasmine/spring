package com.jeni;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Customer {
	
	private LinkedHashMap<String, String> countryList;
	private LinkedHashMap<String, String> cuisineList;
	
    @NotNull(message="Required field")
    //@NotBlank(message="Required field")
	@Size(min= 3, message="The name should have minimum 3 characters")
	@Pattern(regexp = "[a-zA-Z .']+", message="Name has invalid characters")
//	@Pattern(regexp = "^\\S+$", message = "Name field cannot be empty")
	private String name;
	private String country;
	private String favCuisine;
	
	@Size(min=2, message="Select atleast two book")
	//@NotNull(message="select atleast one book")
	private String[] books;
	
	@NotNull
	@Min(value=0, message="Cannot be less than zero")
	@Max(value=10, message="Cannot be greater than 10")
	private int discountCoupons;

	
	
	
	public Customer() {
		countryList = new LinkedHashMap<String, String>();
		countryList.put("IN", "India");
		countryList.put("USA", "United States of America");
		countryList.put("CA", "Canada");
		countryList.put("FR", "France");
		countryList.put("BR", "Brazil");
		cuisineList = new LinkedHashMap<String, String>();
		cuisineList.put("Punjabi", "Punjabi");
		cuisineList.put("SouthIndian", "SouthIndian");
		cuisineList.put("Goan", "Goan");
		cuisineList.put("Malabari", "Malabari");
		cuisineList.put("Rajasthani", "Rajastani");
		
	}
	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getFavCuisine() {
		return favCuisine;
	}
	public void setFavCuisine(String favCuisine) {
		this.favCuisine = favCuisine;
	}
	public LinkedHashMap<String, String> getCuisineList() {
		return cuisineList;
	}
	public void setCuisineList(LinkedHashMap<String, String> cuisineList) {
		this.cuisineList = cuisineList;
	}
	public void setCountryList(LinkedHashMap<String, String> countryList) {
		this.countryList = countryList;
	}
	
	public String[] getBooks() {
		return books;
	}
	public void setBooks(String[] books) {
		this.books = books;
	}
	public int getDiscountCoupons() {
		return discountCoupons;
	}
	public void setDiscountCoupons(int discountCoupons) {
		this.discountCoupons = discountCoupons;
	}
	
}
