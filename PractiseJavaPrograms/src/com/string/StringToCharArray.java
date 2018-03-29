package com.string;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		
		String str = "Hello";
		char[] charArray = str.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		char[] char1Array = new char[5];
		str.getChars(0, 4, char1Array, 0);
		System.out.println(": "+Arrays.toString(char1Array));
	}

}
