package com.test;

import java.util.Scanner;

public class WorkingWithScannerclass {

	public static void main(String[] args) {

		/*
		 * System.out.println(" The Employee Details"); Scanner s = new
		 * Scanner(System.in); String name = s.nextLine();
		 * System.out.println("The Employee Name is :" + name);
		 * 
		 * int number = s.nextInt(); System.out.println("The employee Id is:" + number);
		 * String email = s.next(); System.out.println("The Employee Email is :" +
		 * email); long phNo = s.nextLong();
		 * System.out.println("The Employee Phone Number is :" + phNo); float salary =
		 * s.nextFloat(); System.out.println("The Employee Salary is :" + salary);
		 * String gender = s.next(); System.out.println("The Employee gender is :" +
		 * gender); String city = s.next(); System.out.println("The Employee city is:" +
		 * city);
		 */
		System.out.println("The Student Details");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		System.out.println("The Student Id is :" + id);
		String name = s.next();
		System.out.println("The Student Name is:" + name);
		short mark1 = s.nextShort();
		System.out.println("The Physics Mark for the Student is :" + mark1);
		short mark2 = s.nextShort();
		System.out.println("The Chemistry Mark for the Student is :" + mark2);
		short mark3 = s.nextShort();
		System.out.println("The Maths Mark for the Student is :" + mark3);
		int addingMarks = mark1 + mark2 + mark3 ;
		System.out.println("The Average Marks Of the Student :" + addingMarks/3);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
