package com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCollectionTest {
	public void hashMapCollections() {
		HashMap map = new HashMap();
		map.put(1, "apple");
		map.put(2, "banana");
		map.put(3, 100);
		map.put(4, true);
		map.put(5, 10.00);
		map.put(6, true);
		System.out.println(map);
		
	}

	public void linkedHashMapCollections() {
		 LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();  
		 map.put(1, "banana");
		 map.put(2, "true");
		 map.put(3, "banana");
		 System.out.println(map);
	}
}
