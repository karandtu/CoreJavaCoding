package com.corejava.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {

	
	public static void main(String args[]) {
	
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi","India");
		cityCode.put("Moscow","Russia");
		cityCode.put("WashingtonDC","USA");
		cityCode.put("Doha","Qatar");

		
		Iterator iterator = cityCode.keySet().iterator();
		
		
		while(iterator.hasNext()) {
			System.out.println(cityCode.get(iterator.next()));
			//you cant add on a Hashmap collection while a thread is iterating over it.
		    cityCode.put("Karachi", "Pakistan");
		}
	}
}
