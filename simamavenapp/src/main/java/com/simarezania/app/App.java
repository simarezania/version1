package com.simarezania.app;

import java.sql.SQLException;

import com.simarezania.app.repo.School;
import com.simarezania.app.repo.SchoolDao;
import com.simarezania.app.repo.SchoolDaoDatabaseImpl;
import com.simarezania.app.repo.Student;
import com.simarezania.app.repo.StudentDao;
import com.simarezania.app.repo.StudentDaoDatabaseImpl;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		/*StudentDao studentDao = new StudentDaoDatabaseImpl();
		Student myStudent=new Student();
		myStudent.setFirst_Name("ramin");
		myStudent.setLast_Name("behnia");
		myStudent.setSchool_id(2);
		studentDao.updateStudent(3, myStudent);
		*/
		
		SchoolDao schoolDao = new SchoolDaoDatabaseImpl();
		School mySchool=new School();
		mySchool.setName("esmat");
		mySchool.setAddress("bahman");
		schoolDao.updateSchool(4,mySchool);

	//	studentDao.addStudent("mehri", "manafi", 3);
		// studentDao.updateStudent(8, "zarnani", "hasan", 3);
		// studentDao.delete(10);
		// studentDao.printAllStudents();
		// studentDao.countAll();
		// studentDao.printStudents("mehri");

		// SchoolDao schoolDao = new SchoolDaoDatabaseImpl();
		 //schoolDao.countAll();
		// schoolDao.addSchool("motahari", "tehran");
		// schoolDao.printSchools("eghbal");
		// schoolDao.printAllSchools();
		 //schoolDao.delete(1);
		 
		 

	}
}
