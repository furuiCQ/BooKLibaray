package com.frain.entity.exception;

public class OperationBookException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5773005983373943617L;
	public static String DELET_IS_FAULT="delet is fault";
	public static String DELETACOUNT_IS_FAULT="delet teach account is fault";
	
	public static String SEARCH_IS_FAULT="search is fault";
	
	
	public static String ADD_IS_FAULT="add is fault";

	public OperationBookException() {
		super();
	}

	public OperationBookException(String str) {
		super(str);
	}
}
