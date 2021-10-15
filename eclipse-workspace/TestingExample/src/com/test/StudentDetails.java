package com.test;

public class StudentDetails {
	private void students(int a, int b) {
		System.out.println("The Abhishek age is :" + a + "\n" + "The Arun age is :" + b);
	}

	private void students(int a, long b) {
		System.out.println("The Abhishek Student Id is :" + a + "\n" + "The Arun Student Id is :" + b);
	}

	private void students(int id, String std, char gender) {

		System.out.println("The Abhishek Id is :" + id + "\n" + "The Abhishek Studying in :" + std + "\n"
				+ "The Abishek gender is :" + gender);
	}

	private void students(long phNo, String name) {

		System.out
				.println("The Name of the Student is :" + name + "\n" + "The Phone Number of the Student is :" + phNo);
	}

	private void students(String name, long phNo) {

		System.out
				.println("The Name of the Student is :" + name + "\n" + "The Phone Number of the Student is :" + phNo);
	}

	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();

		s.students(20, 21);
		s.students(124566, 124446l);
		s.students(124566, "10 th Standard", 'M');
		s.students(9874563214l, "Arun");
		s.students(9785463215l, "Varun");

	}

}
