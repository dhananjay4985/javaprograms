package com.string;

public class StringSwitchCase {

	public static void switchCase(String color) {
		switch(color) {
		case "Red":System.out.println("Red");
		break;
		case "Orange": System.out.println("Orange");
		break;
		default:System.out.println("defalut");
		}

	}
	public static void main(String[] args) {

		switchCase("Red");
		switchCase("Orange");
		switchCase(null);
	}

}


/*Keys points to know for java switch case String are:

1. Java switch case String make code more readable by removing the multiple if-else-if chained conditions.
2. Java switch case String is case sensitive, the output of example confirms it.
3. Java Switch case uses String.equals() method to compare the passed value with case values, 
	so make sure to add a NULL check to avoid NullPointerException.
4. According to Java 7 documentation for Strings in Switch, java compiler generates 
	more efficient byte code for String in Switch statement than chained if-else-if statements.
5. Make sure to use java switch case String only when you know that it will be used with Java 7 else it will throw Exception.
 * */
 