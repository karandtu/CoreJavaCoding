package com.corejava.examples;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample1 {

	
	public static void main(String args[]) {
		
		//Making a fresh clone of the original arrayList/List to avoid concurrentModificationException
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] {1,3,5,8});
		Iterator<Integer> itr=list.iterator();
		 
		
		 while(itr.hasNext()) {
			 Integer number = (Integer)itr.next();
			 if (number == 3) {
				 //there is no concurrentModificationException
				 list.add(7);
			 }
			
		}
		 System.out.println(list);
	}
}
