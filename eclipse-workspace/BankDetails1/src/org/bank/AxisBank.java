package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit interest is 6%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank b = new AxisBank();
		b.saving();
		b.fixed();
		b.deposit();
	}

}
