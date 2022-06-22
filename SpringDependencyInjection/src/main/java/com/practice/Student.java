package com.practice;

public class Student {
	
	private String studentName;
	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
	}
	
	public Student(int id) {
		this.id= id;
	}
	

	private int id;
	
	public void displayStudentInfo() {
		System.out.println("name of student is: "+ studentName+ "\n"+" and id is: "+ id);
	}

}
