package com.test;

public class InstanceVariable {
	public int a;

	public void instanceVariable() {
		a = 150;
		System.out.println("The given Instance Variable:" + a);

	}

	public static void main(String[] args) {
		// System.out.println(a);
		InstanceVariable i = new InstanceVariable();
		System.out.println("Before method Calling:" + i.a);
		i.instanceVariable();
		System.out.println("After Method Caling :" + i.a);
		// System.out.println(a);
		InstanceVariable i1 = new InstanceVariable();
		// System.out.println("After Creating 2nd Object:"+a);
		// i1.a;
		System.out.println("After Creating new Objects :" + i1.a);
	}

}
