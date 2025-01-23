package com.studentinfo;

public class StudentDemo implements StudentInterface{
	
	public int id;
	public String name;
	public int marks;

	public StudentDemo(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public void studentDetails() {
		System.out.println("student created successfully");
	}
	
	public int sumMarks(int marks) {
		return marks;
	}
	
	// method overloading
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	// method overriding
	public void studentMarks(int marks) {
		System.out.println("student marks:" + marks);
	}
}
