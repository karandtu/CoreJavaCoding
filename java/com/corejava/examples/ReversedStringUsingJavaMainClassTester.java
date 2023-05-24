package com.corejava.examples;

public class ReversedStringUsingJavaMainClassTester {

	public static void main(String args[]) {
		
		String string = "GeeksForGeeks";
		ReversedStringUsingJavaStreams reverseStringObject = new ReversedStringUsingJavaStreams();
		String reversedStringFinalResult = reverseStringObject.reverseString(string);
		System.out.println(reversedStringFinalResult);
	}
}
