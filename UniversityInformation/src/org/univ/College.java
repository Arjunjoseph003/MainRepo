package org.univ;

public class College extends University {
	public void ug() {
		// TODO Auto-generated method stub
		System.out.println("UG id Bachelor Degree");
	}

	public void pg() {
		// TODO Auto-generated method stub
		System.out.println("PG is Masters Degree");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College();
		c.ug();
		c.pg();
	}

}
