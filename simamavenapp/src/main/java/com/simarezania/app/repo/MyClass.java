package com.simarezania.app.repo;

public class MyClass {

	// Parent y=new Child();
	// Child t =new Child();
	public void me(Parent x) {
		System.out.println(x.getClass());
	}

	public static void display() {
		System.out.println("here is in the static method");
	}
}
/*
 * public class MyClass { public void me(Parent p) { System.out.print(); } }
 */