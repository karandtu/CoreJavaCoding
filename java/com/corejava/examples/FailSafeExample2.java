package com.corejava.examples;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample2 {

	public static void main(String args[]) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] {1,3,5,8});
	    Iterator<Integer> itr = list.iterator();
	    while(itr.hasNext()) {
	    	if(itr.next()==8) {
	    	    list.add(9);
	    	
	    	}
	}
	    System.out.println(list);
	}
}
