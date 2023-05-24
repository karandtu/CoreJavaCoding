package com.corejava.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseSortExample1 {

	
	public static void main(String args[]) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(120);
		list.add(220);
		list.add(320);
		list.add(420);
		list.add(520);
		list.add(620);
		list.add(720);
		list.add(820);
		list.add(920);
		
		//reverse the list using Collections Comparator framework.
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	
	}
}
