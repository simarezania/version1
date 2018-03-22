package com.simarezania.app;

import java.sql.SQLException;

import com.simarezania.app.repo.StudentDao;
import com.simarezania.app.repo.StudentDaoDatabaseImpl;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		StudentDao studentDao = new StudentDaoDatabaseImpl();
		
		//studentDao.addStudent("mehri", "manafi", 3);
		//studentDao.updateStudent(8, "zarnani", "hasan", 3);
		//studentDao.deleteStudent(2);
		//studentDao.printAllStudents();
		studentDao.countAll();
		//studentDao.printStudents("mehri");
	}
}
