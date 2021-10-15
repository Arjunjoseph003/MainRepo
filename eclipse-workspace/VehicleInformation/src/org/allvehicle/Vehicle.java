package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void vehicleNecessary() {
		// TODO Auto-generated method stub
		System.out.println("What type of vehicle is necessary ? ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v = new Vehicle();
		v.vehicleNecessary();
		TwoWheeler t = new TwoWheeler();
		t.bike();
		t.cycle();
		ThreeWheeler th = new ThreeWheeler();
		th.auto();
		FourWheeler f = new FourWheeler();
		f.car();
		f.bus();
		f.lorry();
	}

}
