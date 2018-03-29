package com.string;

public class PlaindronUsingCustom {
	//A String is said to be Palindrome if it’s value is same when reversed. For example “aba” is a Palindrome String.
	//String class doesn’t provide any method to reverse the String 
	//but StringBuffer and StringBuilder class has reverse method that we can use to check if String is palindrome or not.
	
	private static boolean isPalindrom(String str) {
		if(str==null) {
			return false;
		}
		int strLength = str.length();
		System.out.println("Lenght :"+strLength);
		for(int i=0;i<strLength/2;i++) {             //i=0, 5/2=2.5,  0,1,2
			if(str.charAt(i)!= str.charAt(strLength-i-1)) { 
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String test = "aabaa";

		Boolean str = isPalindrom(test);
		System.out.println("Str :"+str);
	}

}
