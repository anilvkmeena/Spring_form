package com.anil.model;

import java.util.HashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String fname;
	private String lname;
	
	private String  field;
	private HashMap<String,String> fieldList;
	
	public Employee() {
		System.out.println("in construcor");
		fieldList = new HashMap<String, String>();
		fieldList.put("java", "java");
		fieldList.put("python", "python");
		fieldList.put("c", "c++");
		fieldList.put("go","go");
		
		
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public HashMap<String, String> getFieldList() {
		return fieldList;
	}
	/*public void setFieldList(HashMap<String, String> fieldList) {
		this.fieldList = fieldList;
	}*/
	
}
