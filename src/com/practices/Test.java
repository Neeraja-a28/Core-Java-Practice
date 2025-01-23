package com.practices;

import com.collections.ListCollestionsTest;
import com.collections.SetCollectionsTest;
import com.studentinfo.StudentDemo;
import com.studentinfo.StudentDemoTwo;

public class Test {

	public static void main(String[] args) {
		System.out.println("java application is created!");
		
		StudentDemo std = new StudentDemo(100, "jhon", 80);
		System.err.println("Student details are: Name is: "+ std.name+" with marks : "+ std.marks);
		
		std.studentDetails();
		std.sumMarks(68);
		System.out.println("successfully student details entered");
		
		// System.out.println(std.sum(2, 3));
		// System.out.println(std.sum(2, 3,5));
		
		StudentDemoTwo st2 = new StudentDemoTwo(101, "raju", 56);
		// st2.studentMarks(st2.marks);
		// std.studentMarks(std.marks);
		
		
		// st2.testExceptionHandling();
		
		ListCollestionsTest list = new ListCollestionsTest();
		list.arrayListCollection();
		// list.linkedListCollection();
		// list.vectorListCollections();
		
		SetCollectionsTest set = new SetCollectionsTest();
		set.hashSetCollection();
		set.linkedHashSetCollections();
		// set.treeSetCollections();
		

	}

}
