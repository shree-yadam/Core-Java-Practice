package com.shree.apexjavalearning;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "Scala");
		map.put(4, "Scala");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println("Key is: " + entry.getKey() + " Value is: " + entry.getValue());
		}
		
		for(Integer key: map.keySet()) {
			System.out.println("Key is: " + key + " Value is: " + map.get(key));
		}
	}
}
