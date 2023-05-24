package com.corejava.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample1 {

	
	public static void main(String args[]) {
		
	 ArrayList<Integer> list = new ArrayList<Integer>();
	 list.add(1);
	 list.add(2);
	 list.add(3);
	 list.add(4);
	 
	 
	 Iterator<Integer> itr = list.iterator();
	 while(itr.hasNext()) {
		 if(itr.next() == 2) {
			 //you cant modify the collection while thread is iterating over an arrayList collection.
			 list.remove(1);
		 }
	 }
	 System.out.println(list);
		
	 
	}
	
	

}
