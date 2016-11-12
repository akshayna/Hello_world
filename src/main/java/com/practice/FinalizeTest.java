package com.practice;

class A {
	int i;

	public A(int i) {
		this.i = i;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("From Finalize Method, i = " + i);
		// Calling super class finalize() method explicitly
		super.finalize();
	}
}

public class FinalizeTest {
	public static void main(String[] args) throws Throwable {
		// Creating two instances of class A
		A a1 = new A(10);
		A a2 = new A(20);
		// Calling finalize() method of a1 before it is abandoned
		a1.finalize();
		// Assigning a2 to a1
		a1 = a2;
		a1.i = 30;
		System.out.println(a1.i);
		System.out.println(a2.i);
		// Now both a1 and a2 will be pointing same object
		// An object earlier referred by a1 will become abandoned
		System.out.println("done");
	}
}
