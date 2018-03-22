package com.simarezania.app.repo;

import junit.framework.TestCase;

public class StudentDaoDatabaseImplcountAllTest extends TestCase {

	public void testCountAll() {
		StudentDaoDatabaseImpl test = new StudentDaoDatabaseImpl();
		int output =test.countAll();
		assertEquals(28,output);
		
	}

}
