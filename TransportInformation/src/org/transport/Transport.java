package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	private void transportForm() {
		// TODO Auto-generated method stub
		System.out.println("The Transportation medium types");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport t = new Transport();
		t.transportForm();
		Road r = new Road();
		r.bike();
		r.bus();
		r.cycle();
		r.car();
		Air a = new Air();
		a.aeroplane();
		a.helicopter();
		Water w = new Water();
		w.boat();
		w.ship();
	}

}
