package com.java.enums;

public class EnumMethods {

	public enum EmployeeRating{
		OUTSTANDING,GOOD,AVERAGE,POOR;
	}
	public static void main(String[] args) {
		
		EmployeeRating [] ratings = EmployeeRating.values();
		for(EmployeeRating rating : ratings) {
			
			System.out.println(rating.ordinal());
		}
		System.out.println(""+EmployeeRating.valueOf("AVERAGE"));
	}

}
