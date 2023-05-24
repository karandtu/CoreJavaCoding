package com.corejava.examples;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample3 {

	
	public static void main(String args[]) {
		
		ConcurrentHashMap<String,Integer> threadSafeMap = new ConcurrentHashMap<String, Integer>();
		threadSafeMap.put("ONE",1);
		threadSafeMap.put("TWO",2);
		threadSafeMap.put("THREE", 3);
		threadSafeMap.put("FOUR", 4);
		
		
		Iterator<String> itr = threadSafeMap.keySet().iterator();
		
		while(itr.hasNext()) {
			String key = (String)itr.next();
			System.out.println(key + ":" + threadSafeMap.get(key));
			threadSafeMap.put("EIGHT", 8);
		}
		System.out.println(threadSafeMap);
		 
	}
	
	
	
	
}
