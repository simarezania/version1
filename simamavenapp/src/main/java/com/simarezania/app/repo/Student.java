package com.simarezania.app.repo;



public class Student  {
	 int id;
	String last_name;
	String first_name;
	int school_id;

	public void setLast_Name(String s) {
		last_name = s;
	}

	public String getLast_Name() {
		return last_name;
	}

	public void setFirst_Name(String s) {
		first_name = s;
	}

	public String getFirst_Name() {
		return first_name;
	}

	public void setSchool_id(int n) {
		school_id = n;
	}

	public int getSchool_id() {
		return school_id;
	}

}
