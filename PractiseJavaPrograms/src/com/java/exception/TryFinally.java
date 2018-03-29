package com.java.exception;

public class TryFinally {

	public static int getNumber() {
		
		try {
			return 112;
		
		}
		
		finally {
			System.out.println("stmt1");
			System.out.println("stmt2");
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(getNumber());
	}

}
