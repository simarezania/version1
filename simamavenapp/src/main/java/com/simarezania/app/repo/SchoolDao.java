package com.simarezania.app.repo;

public interface SchoolDao {
	void addSchool(String schoolName, int schoolId);
	boolean updateStudent(int id, String newLastName, String newFirstName, int newSchoolID);

}
