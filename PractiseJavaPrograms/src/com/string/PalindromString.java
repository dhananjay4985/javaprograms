package com.string;

public class PalindromString {
	//A String is said to be Palindrome if it’s value is same when reversed. For example “aba” is a Palindrome String.
		//String class doesn’t provide any method to reverse the String 
		//but StringBuffer and StringBuilder class has reverse method that we can use to check if String is palindrome or not.

	
	private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
	private static boolean isStrPalindrome(String str) {
        if (str == null)
            return false;
        StringBuffer strBuffer = new StringBuffer(str);
        strBuffer.reverse();
        return strBuffer.toString().equals(str);
    }
	
	public static void main(String[] args) {
		//
		String test="aabaa";
		Boolean b = isPalindrome(test);
		Boolean bb = isStrPalindrome(test);
		System.out.println("Buffer :"+ bb);
		System.out.println("Builder:"+ b);
		
	}

}
