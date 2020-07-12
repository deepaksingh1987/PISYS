package com.javaprogramming.array;

public class ExceptionTest {

	public static void main(String[]arg) {
		
		try {
			System.out.println("Thsis is before exception java code in try block ");
			int i=10/0;
			System.out.println("----------------------------");
			System.out.println("Thsis is after exception java code in try block ");
		}
		catch(IndexOutOfBoundsException  ex) {
			System.out.println("Arithmatic exception ex");
		}finally {
			System.out.println("........................");
			System.out.println("this is finally block");
		}
		
		System.out.println("-----------------------------");
		System.out.println("This is Remaing Code ");
	}
}
