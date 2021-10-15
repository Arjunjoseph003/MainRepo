package org.phone;

public class InternalStorage {

	private void processorName() {
		// TODO Auto-generated method stub
		System.out.println("The processor Name is Qualcomm Snapdragon");
	}

	private void ramSize() {
		// TODO Auto-generated method stub
		System.out.println("THe ram Size is 4GB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExternalStorage e = new ExternalStorage();
		e.size();
		InternalStorage i = new InternalStorage();
		i.processorName();
		i.ramSize();
	}

}
