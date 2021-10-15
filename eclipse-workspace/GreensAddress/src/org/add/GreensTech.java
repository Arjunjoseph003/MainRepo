package org.add;

public class GreensTech {
	private void greensOMR(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("Greens Technology " + "\n" + "Student Id :" + id + "\n" + "Student Name :" + name + "\n");
	}

	private void greensOMR(int id, String name, long phno) {
		// TODO Auto-generated method stub
		System.out.println("Greens Technology " + "\n" + "Student Id :" + id + "\n" + "Student Name :" + name + "\n"
				+ "Student PhNo :" + phno + "\n");
	}

	private void greensOMR(int id, long phno, String name) {
		// TODO Auto-generated method stub
		System.out.println("Greens Technology " + "\n" + "Student Id :" + id + "\n" + "Student phno :" + phno + "\n"
				+ "Student Name :" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreensTech g = new GreensTech();
		g.greensOMR(15647, "Arvind");
		g.greensOMR(12568, "Adhav", 9632587415l);
		g.greensOMR(19875, 9874561236l, "Maran");
	}

}
