package com.frain.entity.exception;

public class LoginExpection extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8863932746459077105L;
	
	
	public static String NAME_IS_NULL="the login name is null,please confirm!";
	public static String PASSWORD£ßIS_WORNG="the password is wrong,please confirm!";
	
	
	
	public LoginExpection() {
		super();
	}

	public LoginExpection(String str) {
		super(str);
	}
}
