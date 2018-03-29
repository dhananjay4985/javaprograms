package com.java.exception;

import java.io.*;


//Method 1:  Declare the exception using throws keyword
public class CheckedExceptionFile {

	/*public static void main(String[] args)throws IOException {
		FileInputStream fis;

			fis=new FileInputStream("C:\\Users\\shind504\\eclipse-workspace\\SampleJavaPrograms\\resources\\input.txt");
			int no;
			while((no = fis.read())!=-1) {
				System.out.println("char :"+(char)no );
			}
			fis.close();
	}*/


	//Method 2: Handle them using try-catch blocks.
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Users\\shind504\\eclipse-workspace\\SampleJavaPrograms\\resources\\input.txt");
		}
		catch(FileNotFoundException file) {
			System.out.println("File not found in dir");
		}

		int no;
		try {
			while((no = fis.read())!=-1) {
				System.out.println("char :"+(char)no );
			}
			fis.close();
		}
		catch(IOException input) {
			System.out.println("reading error");
		}
		finally {
			System.out.println("Finally blk executed");
		}
	}
}
