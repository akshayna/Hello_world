package com.practice;

import java.util.ArrayList;

public class CustomArrayList<E> extends ArrayList<E>{
	private static final long serialVersionUID = 6640715525741699086L;
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("In finalize method");
	}
}
