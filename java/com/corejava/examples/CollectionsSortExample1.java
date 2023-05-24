package com.corejava.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortExample1 {

	
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<String>();
		list.add("Aaron");
		list.add("Apple");
		list.add("Bob");
		list.add("Bear");
		list.add("dog");
		list.add("derek");
		list.add("erik");
		list.add("evan");
		list.add("fighter");
		
		
		//natural ordering and sorting of the list using Collections framework.
		Collections.sort(list);
		System.out.println("Listed sorted in its natural ordering:"+ list);
	}
}
