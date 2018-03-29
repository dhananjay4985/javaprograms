package com.string;

public class StringOperations {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strr = new String("Hi");
		String str ="Hello";
		String str1= "Hello";
		str.intern();
		System.out.println(""+str.hashCode() +":"+str1.hashCode());
		System.out.println("New :"+strr.hashCode());
		System.out.println("Upper :"+str.toUpperCase() +" Lower :"+str.toLowerCase());
		String s1="Hello";
		String s2 = new String("Hello");
		s2= s2.intern();
		s2.hashCode();
		System.out.println(s1==s2);
	}

}
