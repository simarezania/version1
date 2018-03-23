package com.simarezania.app.repo;

public class Client {

	public static void main(String[] args) {

		Parent y = new Child();
		Child t = new Child();
		MyClass a = new MyClass();

		Client b = new Client();
		// System.out.println(y.getClass());
		// System.out.println(t.getClass());

		a.me(y);
		a.me(t);

		MyClass.display();
		b.BStatic();

	}

	public void BStatic() {
		System.out.println("here is in the non static method");
	}
}
