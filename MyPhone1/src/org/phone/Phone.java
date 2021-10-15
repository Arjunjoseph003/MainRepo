package org.phone;

public class Phone {
	private void phoneInfo(long a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The Mobile number for Ganesh:" + a + "\n" + "The Landlinenumber for Ganesh: 044" + b);
	}

	private void phoneInfo(int a, long b) {
		// TODO Auto-generated method stub
		System.out.println("The Landline number for Dinesh:044" + a + "\n" + "The Mobile number for Dinesh:" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.phoneInfo(987654321l, 456321);
		p.phoneInfo(789654, 9847561235l);
	}

}
