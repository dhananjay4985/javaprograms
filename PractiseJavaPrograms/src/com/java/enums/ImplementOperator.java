package com.java.enums;

public enum ImplementOperator implements Operator {	

	PLUS{
		@Override
		public int operation(int a, int b) {

			return a+b;
		}
	},
	
	MINUS{
		@Override
		public int operation(int a, int b) {

			return a-b;
		}
	},
	MUL{
		@Override
		public int operation(int a, int b) {

			return a*b;
		}
	}

}
