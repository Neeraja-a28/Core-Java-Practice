package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListCollestionsTest {
	
	//  List allows duplicate elements and maintains insertion order
	// ArrayList internally uses a dynamic array to store the element
	// LinkedList internally uses a doubly linked list to store the elements. 
	// Manipulation with ArrayList is slow because it internally uses an array. 
	// If any element is removed from the array, all the other elements are shifted in memory.
	
	public void arrayListCollection() {
		ArrayList list= new ArrayList();
		list.add(10);
		list.add("amar");
		list.add(true);
		list.add(10);
		list.add(10.8);
		System.out.println(list);
		
		Iterator it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void linkedListCollection() {
		LinkedList lt = new LinkedList();
		lt.add("10");
		lt.add("amar");
		lt.add(true);
		lt.add(10);
		lt.add(10.8);
		System.out.println(lt);
	}
	
	public void vectorListCollections() {
		Vector v = new Vector();
		v.add(10);
		v.add("amar");
		v.add(true);
		v.add(10);
		v.add(10.8);
		System.out.println(v);
	}

}
