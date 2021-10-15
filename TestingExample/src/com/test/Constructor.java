package com.test;

public class Constructor {

	public Constructor() {
		this(89);
		System.out.println("Its a default constructor");
	}

	public Constructor(int mark) {
		
		System.out.println("Its a parameterized constructor:" + mark);
	}

	public Constructor(String name) {
		this(123.4546f);
		System.out.println("Its a parameterized constructor:" + name);
	}

	public Constructor(float salary) {
		System.out.println("Its a parameterized constructor:" +salary);
	}

	public static void main(String[] args) {

		Constructor c = new Constructor("Arjun");

	}

}
