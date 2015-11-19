package com.frain.entity.interfac;

public interface DataInteface {
	public void register(String name,String fristPassword,String confirmPassword,int type);

	public void login(String name, String Password, int type);

	public void loanBook();

	public void searchBook();

	public void deletBook();

	public void addBook();
	
	public void modifyAccountDate();
}
