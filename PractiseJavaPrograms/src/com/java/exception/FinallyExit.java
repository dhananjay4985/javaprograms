package com.java.exception;

public class FinallyExit {

	public static void main(String[] args) {
		try {
			System.out.println("In try");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("In catch");
		}
		finally {
			System.out.println("In finally");
		}
		System.out.println("Outside");
	}

}
