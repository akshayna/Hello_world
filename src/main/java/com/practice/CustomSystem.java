package com.practice;

public class CustomSystem {
	private static volatile CustomSecurityManager security;

	public static CustomSecurityManager getSecurityManager() {
		return security;
	}
}
