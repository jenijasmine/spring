package com.jeni;

import com.jeni.validation.CourseCode;
import com.jeni.validation.SeedCode;

public class Student {
	
	private String firstName;
	private String lastName;
	
	@CourseCode(value="VAR")
	private String courseId;
	
	@SeedCode
	private String prime;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getPrime() {
		return prime;
	}
	public void setPrime(String prime) {
		this.prime = prime;
	}

}
