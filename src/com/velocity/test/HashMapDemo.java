package com.velocity.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Praveen");
		map.put(102, "naveen");
		map.put(103, "raveen");
		System.out.println(map);
	}

}
