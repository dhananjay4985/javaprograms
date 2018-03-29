package com.java.enums;

public class CallPerformOperation {

	public static void main(String[] args) {
		PerformOperation op = new PerformOperation(10, 10, ImplementOperator.PLUS);	
		System.out.println("Addition :"+op.calculate());
		PerformOperation op1 = new PerformOperation(10, 10, ImplementOperator.MUL);	
		System.out.println("Multiplication :"+op1.calculate());
	}

}
