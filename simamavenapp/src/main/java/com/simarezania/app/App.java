package com.simarezania.app;

import java.sql.SQLException;

import com.simarezania.app.repo.SchoolDao;
import com.simarezania.app.repo.SchoolDaoDatabaseImpl;
import com.simarezania.app.repo.StudentDao;
import com.simarezania.app.repo.StudentDaoDatabaseImpl;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		//StudentDao studentDao = new StudentDaoDatabaseImpl();

	//	studentDao.addStudent("mehri", "manafi", 3);
		// studentDao.updateStudent(8, "zarnani", "hasan", 3);
		// studentDao.delete(10);
		// studentDao.printAllStudents();
		// studentDao.countAll();
		// studentDao.printStudents("mehri");

		 SchoolDao schoolDao = new SchoolDaoDatabaseImpl();
		 //schoolDao.countAll();
		// schoolDao.addSchool("motahari", "tehran");
		// schoolDao.printSchools("eghbal");
		// schoolDao.printAllSchools();
		 schoolDao.updateSchool(2, "eghbal1");
		 //schoolDao.delete(1);
		 
		 

	}
}
