package org.bike;

public class Ktm implements Bike {
	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("Cost of the bike is one lakh rupees");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("speed of the bike is 150cc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}

}
