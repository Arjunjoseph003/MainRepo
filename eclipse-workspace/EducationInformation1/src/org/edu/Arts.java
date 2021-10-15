package org.edu;

public class Arts extends Education {
	private void bSc() {
		// TODO Auto-generated method stub
		System.out.println("bSc is Bachelor of science ");
	}

	private void bEd() {
		// TODO Auto-generated method stub
		System.out.println("bEd is Bachelor of Education");
	}

	private void bA() {
		// TODO Auto-generated method stub
		System.out.println("bA is Bachelor of Arts");
	}

	private void bBA() {
		// TODO Auto-generated method stub
		System.out.println("bBA is bachelor of Business of Administration");
	}

	public void ug() {
		// TODO Auto-generated method stub
		System.out.println("Course Name is Under Graduation");
	}

	public void pg() {
		// TODO Auto-generated method stub
		System.out.println("Course Name is post Graduation ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arts a = new Arts();
		a.bA();
		a.bEd();
		a.bSc();
		a.bBA();
		a.ug();
		a.pg();
	}

}
