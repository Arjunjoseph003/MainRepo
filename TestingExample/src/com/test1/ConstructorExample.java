package com.test1;

import com.test.Constructor;

public class ConstructorExample extends Constructor {
	
	public ConstructorExample() {
		super("Arjun");
		System.out.println
		("Its a default Constructor Example");
		
	}
	
public ConstructorExample(int age) {
		System.out.println(age);
	}
	public static void main(String[] args) {
		
ConstructorExample ce=new ConstructorExample();

	}

}
