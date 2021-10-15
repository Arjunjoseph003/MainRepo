package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		// TODO Auto-generated method stub
		System.out.println("The Account which can be mantained with the Zerobalance for a period of Six months");
	}

	private void fixed() {
		// TODO Auto-generated method stub
		System.out.println(
				"The Account Which can be deposit and having an interest plus principal after a few years is called fixed ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}

}
