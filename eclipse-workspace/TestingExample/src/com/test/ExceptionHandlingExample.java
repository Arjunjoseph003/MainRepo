package com.test;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		String employeeId = "AO245";
		System.out.println(employeeId);

		try {

			int parseInt = Integer.parseInt(employeeId);
		}
		catch (Exception e) {
			System.out.println("contains Alpha numeric values");
			e.printStackTrace();
			
		}

	}

}
