package com.studentinfo;

// Inheritance 
public class StudentDemoTwo extends StudentDemo{

	public StudentDemoTwo(int id, String name, int marks) {
		super(id, name, marks);
	}
	
	public void studentMarks(int marks) {
		System.out.println("Student Name: "+ this.name+" with marks: " + marks);
		if (marks > 75) {
			System.out.println("A grade");
		}
		else if(marks > 50){
			System.out.println("B grade");
		}
		else if(marks > 35) {
			System.out.println("C grade");
		}else {
			System.out.println("Fail");
		}
	}
	
	// Exception handling
	public void testExceptionHandling() {
		try {
			int results = 100/0;
		}
		catch(ArithmeticException ar) {
			System.out.println(ar);
		}
		catch(Exception e) {
			System.out.println("e");
		}
		finally {
			System.out.println("exception handled with or without exception");
		}
	}

}
