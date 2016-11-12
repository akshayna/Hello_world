package com.practice;

public class Person {
	private String id;
	private String name;

	public Person() {
		System.out.println("Person object is created " + this.hashCode());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("person object removed " + this.hashCode());
		super.finalize();
	}
}
