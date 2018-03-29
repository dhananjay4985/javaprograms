package com.java.enums;

public class PerformOperation {

	int a,b;
	private ImplementOperator op;
	
	PerformOperation(int a , int b,ImplementOperator op){
		this.a=a;
		this.b=b;
		this.op=op;		
	}
	public int calculate() {
		return op.operation(a, b);
	}
	
}
