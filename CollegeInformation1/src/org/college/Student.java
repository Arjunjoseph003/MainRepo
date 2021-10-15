package org.college;

public class Student extends College {
	private void studentName() {
		// TODO Auto-generated method stub
		System.out.println("The Student Name is Arjun");
	}

	private void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("The Student dept is Mechanical Engineering ");
	}

	private void studentId() {
		// TODO Auto-generated method stub
		System.out.println("The Student ID is 456123");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.hostelName();
		s.deptName();
		
	}

}
