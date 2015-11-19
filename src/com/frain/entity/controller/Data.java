package com.frain.entity.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

import javax.security.auth.login.LoginException;

import com.frain.entity.Books;
import com.frain.entity.JobNumber;
import com.frain.entity.Student;
import com.frain.entity.SystemAdmin;
import com.frain.entity.Teacher;
import com.frain.entity.exception.RegisterExpection;
import com.frain.entity.interfac.DataInteface;

public class Data implements DataInteface {
	HashMap<String, SystemAdmin> adminList = new HashMap<String, SystemAdmin>();

	LinkedList<Student> studentList = new LinkedList<Student>();

	Vector<Teacher> teacherList = new Vector<Teacher>();

	ArrayList<Books> bookList = new ArrayList<Books>();

	// int booksSize; 无用

	public LinkedList<Student> getStudentList() {
		return studentList;
	}

	public HashMap<String, SystemAdmin> getAdminList() {
		return adminList;
	}

	public void setAdminList(HashMap<String, SystemAdmin> adminList) {
		this.adminList = adminList;
	}

	public void setStudentList(LinkedList<Student> studentList) {
		this.studentList = studentList;
	}

	public Vector<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(Vector<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	public ArrayList<Books> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Books> bookList) {
		this.bookList = bookList;
	}

	@Override
	public void register(String name, String fristPassword, String confirmPassword, int type) {
		// TODO Auto-generated method stub
		try {
			if (name != null && !name.equals("")) {
				throw new RegisterExpection(RegisterExpection.NAME_IS_NULL);
			}
			if (fristPassword != null && !fristPassword.equals("")) {
				throw new RegisterExpection(RegisterExpection.PASSWORD＿IS_NULL);
			}
			if (!fristPassword.equals(confirmPassword)) {
				throw new RegisterExpection(RegisterExpection.PASSWORD＿NOT_EQUALS);
			}

			switch (type) {

			case 0:// 管理员账户注册
				registerAdminAccount(name, fristPassword);
				break;
			case 1:// 老师账户注册
				registerTeacherAccount(name, fristPassword);
				break;
			case 2:// 学生账户注册
				registerStudentAccount(name, fristPassword);
				break;
			default:
				throw new RegisterExpection(RegisterExpection.CONFIRM_ACCOUNT_TYPE);
			}
		} catch (RegisterExpection e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

	public void registerTeacherAccount(String name, String fristPassword) {
		Teacher teacher = new Teacher();
		teacher.setName(name);
		teacher.setPassword(fristPassword);
		teacher.setId(JobNumber.getUUID());
		teacher.setLastModifyTime(JobNumber.getNowTime());
		teacherList.add(teacher);
	}

	public void registerStudentAccount(String name, String fristPassword) {
		Student student = new Student();
		student.setName(name);
		student.setPassword(fristPassword);
		student.setId(JobNumber.getUUID());
		student.setLastModifyTime(JobNumber.getNowTime());
		studentList.add(student);
	}

	public void registerAdminAccount(String name, String fristPassword) {
		SystemAdmin admin = new SystemAdmin();
		admin.setName(name);
		admin.setPassword(fristPassword);
		admin.setId(JobNumber.getUUID());
		admin.setLastModifyTime(JobNumber.getNowTime());
		adminList.put(name, admin);

	}

	@Override
	public void login(String name, String Password, int type) {
		// TODO Auto-generated method stub
		try {
			if (name != null && !name.equals("")) {
				throw new LoginException(RegisterExpection.NAME_IS_NULL);
			}
			if (Password != null && !Password.equals("")) {
				throw new LoginException(RegisterExpection.PASSWORD＿IS_NULL);
			}
			switch (type) {
			case 0:
				
				break;
			case 1:

				break;
			case 2:

				break;
			default:
				throw new LoginException(RegisterExpection.CONFIRM_ACCOUNT_TYPE);
			}
		} catch (LoginException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void loginTeacherAccount(String name, String fristPassword) {
		
		Teacher teacher = new Teacher();
		teacher.setName(name);
		teacher.setPassword(fristPassword);
		teacher.setId(JobNumber.getUUID());
		teacher.setLastModifyTime(JobNumber.getNowTime());
		teacherList.add(teacher);
	}

	public void loginStudentAccount(String name, String fristPassword) {
		Student student = new Student();
		student.setName(name);
		student.setPassword(fristPassword);
		student.setId(JobNumber.getUUID());
		student.setLastModifyTime(JobNumber.getNowTime());
		studentList.add(student);
	}

	public void loginAdminAccount(String name, String fristPassword) {
		SystemAdmin admin = new SystemAdmin();
		admin.setName(name);
		admin.setPassword(fristPassword);
		admin.setId(JobNumber.getUUID());
		admin.setLastModifyTime(JobNumber.getNowTime());
		adminList.put(name, admin);

	}
	
	
	
	@Override
	public void loanBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyAccountDate() {
		// TODO Auto-generated method stub

	}

}
