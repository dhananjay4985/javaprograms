package com.java.exception;

import java.io.*;

public class CheckedException {

	public static void main(String[] args){
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String ss = br.readLine();
		System.out.println("String ss :"+ss);	
			
		
		int num1 =10;
		int num2 = 0;
		
		int ans= num1/num2;
		System.out.println("answer is "+ans);
		}
		catch(IOException|ArithmeticException ee)
		{
			System.out.println(ee.getMessage());
			//throw ee;
			
		}
		finally{
			System.out.println("finally executed");
		}
	}

}
