package com.simarezania.app.repo;

public interface SchoolDao extends BaseDao {
	void addSchool(String schoolName, String address);
	boolean updateSchool(int id, String newName,String address);
	void printSchools(String school);
	void printAllSchools();
}
