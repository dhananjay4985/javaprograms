package com.string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Java is best";
		String[] strArray = str.split(" ");
		//System.out.println(strArray);
		StringBuilder sb = new StringBuilder();
		for(int i=strArray.length-1;i>=0;i--) {
			//System.out.println(strArray[i].toString());
			sb.append(strArray[i].toString()+" ");
		}
		System.out.println(sb);
	}

}
