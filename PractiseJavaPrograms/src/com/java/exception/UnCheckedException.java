package com.java.exception;

import java.io.*;

public class UnCheckedException {
	
	public static void main(String[] args) {
		int num1=10;		
		int ans= num1/0;
		System.out.println(ans);
		//ArithmeticException – When bad data is provided by user, for example, 
			//when you try to divide a number by zero this exception occurs because dividing a number by zero is undefined.

		File f=null;
		System.out.println(f.getAbsoluteFile());
		//NullPointerException – When you try to use a reference that points to null.
		
		int a[]= {1,2,3,4,5,6};
		System.out.println(a[7]);
		//ArrayIndexOutOfBoundsException – When you try to access the elements of an array out of its bounds, 
			//for example array size is 5 (which means it has five elements) and you are trying to access the 10th element.


	}
}
