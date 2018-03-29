package com.java.exception;

import java.util.Scanner;


class InvalidAgeException extends Exception{
	
	private String msg=null;
	
	public InvalidAgeException() {
		super();
	}
	
	public InvalidAgeException(String message) {
		super(message);
		this.msg = message;
	}
	
	/*@Override
	public String toString() {
		return "InvalidAgeException [message=" + msg + "]"+msg;
	}*/

	

}
public class CustomException {

	public static void main(String[] args) {
		Scanner inputAge  = new Scanner(System.in);
		System.out.println("Enter u r age :");
		int age = inputAge.nextInt();
		try {
			if(age<15) {
				//throw new InvalidAgeException();
				throw new InvalidAgeException("Age is invalid of voter");
			}
		}
		catch(InvalidAgeException e) {
			System.out.println("Hi :"+e.getMessage());
		}
	}

}
