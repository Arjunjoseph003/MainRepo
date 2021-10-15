package org.college;

public class College {
	private void collegeName() {
		// TODO Auto-generated method stub
		System.out.println("College name : Anna university");
	}

	private void collegeCode() {
		// TODO Auto-generated method stub
		System.out.println("College Code: 456789");
	}

	private void collegeRank() {
		// TODO Auto-generated method stub
		System.out.println("College Rank : 2nd Rank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		Hostel h = new Hostel();
		h.hostelName();
		Dept d = new Dept();
		d.deptName();
		 
	}

}
