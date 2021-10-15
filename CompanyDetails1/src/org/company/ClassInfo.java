package org.company;

public class ClassInfo {
	private void companyName(String a) {
		// TODO Auto-generated method stub
		System.out.println("The previous company Name for Devan :" + a);
	}

	private void companyName(String a, String b) {
		// TODO Auto-generated method stub
		System.out.println(
				"The previous company Name for Rajesh :" + a + "\n" + "The previous company Name for Ravi :" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInfo cl = new ClassInfo();
		cl.companyName("Tata Motors");
		cl.companyName("Accenture", "Infosys");
	}

}
