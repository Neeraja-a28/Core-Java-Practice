package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetCollectionsTest {
	public void hashSetCollection() {
		HashSet set = new HashSet();
		set.add(10);
		set.add("amar");
		set.add(true);
		set.add(10);
		set.add(10.8);
		System.out.println(set);
		
	}
	
	public void linkedHashSetCollections() {
		LinkedHashSet set = new LinkedHashSet();
		set.add(10);
		set.add("amar");
		set.add(true);
		set.add(10);
		set.add(10.8);
		System.out.println(set);
		
	}
	
	public void treeSetCollections() {
		TreeSet set = new TreeSet();
		set.add(10);
		set.add("amar");
		set.add(true);
		set.add(10);
		set.add(10.8);
		System.out.println(set);
	}

}
