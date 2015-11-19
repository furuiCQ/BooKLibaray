package com.frain.entity.exception;

public class RegisterExpection extends Exception{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2319964610766365210L;
	
	public static String NAME_IS_NULL="the login name is null,please confirm!";
	public static String PASSWORD£ßIS_NULL="the password is null,please confirm!";
	public static String PASSWORD£ßNOT_EQUALS="the two time password is not equals,please confirm!";

	
	
	public RegisterExpection() {
		super();
	}

	public RegisterExpection(String str) {
		super(str);
	}
}
