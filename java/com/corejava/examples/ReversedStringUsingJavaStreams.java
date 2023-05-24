package com.corejava.examples;

public class ReversedStringUsingJavaStreams {

	
	public String reverseString(String input) {
		
		if(input==null) {
			return input;
		}
		
		String output = "";
		for(int i=input.length()-1;i>=0;i--) {
			output = output +input.charAt(i);
		}
		return output;
		
	
	}
}
