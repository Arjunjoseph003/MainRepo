package javaoopsconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class JavaEncapsulation4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the EmpId");
		int empId = s.nextInt();
		System.out.println("Enter the Emp Name");
		String name = s.next();
		System.out.println("Enter the Emp DoB");
		String doB = s.next();
		System.out.println("Enter the Emp PhoneNumber");
		long PhoneNO = s.nextLong();
		System.out.println("Enter the Emp DOJ");
		String doJ = s.next();
		System.out.println("Enter the Emp Address");
		String address = s.next();
		System.out.println("Enter the Emp Email");
		String email = s.next();
		System.out.println("Enter the Emp gender");
		String gender = s.next();
		System.out.println("Enter the Emp salary");
		float salary = s.nextFloat();
		JavaEncapsulation2 je = new JavaEncapsulation2();
		je.setempId(empId);
		je.setName(name);
		je.setPhoneNO(PhoneNO);
		je.setDoB(doB);
		je.setAddress(address);
		je.setDoJ(doJ);
		je.setEmail(email);
		je.setGender(gender);
		je.setSalary(salary);
		Set<JavaEncapsulation2> se = new HashSet<>();
		se.add(je);
		System.out.println();
		for (JavaEncapsulation2 EmpDetails : se) {
			System.out.println("Emplyoee Details");
			System.out.println("Employee Id is :" + EmpDetails.getempId());
			System.out.println("Employee name is :" + EmpDetails.getName());
			System.out.println("Employee DOB is :" + EmpDetails.getDoB());
			System.out.println("Employee DOJ is :" + EmpDetails.getDoJ());
			System.out.println("Employee Gender is :" + EmpDetails.getGender());
			System.out.println("Employee Address is :" + EmpDetails.getAddress());
			System.out.println("Employee PhoneNumber is :" + EmpDetails.getPhoneNO());
			System.out.println("Employee Email is :" + EmpDetails.getEmail());
			System.out.println("Employee Salary is :" + EmpDetails.getSalary());

		}

	}

}
