package com.simarezania.app.repo;

public interface StudentDao extends BaseDao{

	/**
	 * Inserts a new student
	 * 
	 * @param firstName
	 * @param lastName
	 * @param schoolId
	 */
	void addStudent(String firstName, String lastName, int schoolId);


	/**
	 * 
	 * @param id
	 * @param newFirstName
	 * @param newLastName
	 * @param newSchoolID
	 * @return
	 */
	boolean updateStudent(int id, String newLastName, String newFirstName, int newSchoolID);

	/**
	 * Print all students with this first name
	 * 
	 * @param firstName
	 */
	void printStudents(String firstName);
	

	void printAllStudents();

}
