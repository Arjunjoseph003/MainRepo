package javaoopsconcepts;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserDefinedClass {
	static int empId;
	static String name;
	static long phoneNo;
	static String address;
	static String doB;
	static String doj;
	static String eMail;
	static String gender;
	static float salary;
	
		public static int getEmpId() {
		return empId;
	}

	public static String getName() {
			return name;
		}

		public static void setName(String name) {
			UserDefinedClass.name = name;
		}

		public static long getPhoneNo() {
			return phoneNo;
		}

		public static void setPhoneNo(long phoneNo) {
			UserDefinedClass.phoneNo = phoneNo;
		}

		public static String getAddress() {
			return address;
		}

		public static void setAddress(String address) {
			UserDefinedClass.address = address;
		}

		public static String getDoB() {
			return doB;
		}

		public static void setDoB(String doB) {
			UserDefinedClass.doB = doB;
		}

		public static String getDoj() {
			return doj;
		}

		public static void setDoj(String doj) {
			UserDefinedClass.doj = doj;
		}

		public static String geteMail() {
			return eMail;
		}

		public static void seteMail(String eMail) {
			UserDefinedClass.eMail = eMail;
		}

		public static String getGender() {
			return gender;
		}

		public static void setGender(String gender) {
			UserDefinedClass.gender = gender;
		}

		public static float getSalary() {
			return salary;
		}

		public static void setSalary(float salary) {
			UserDefinedClass.salary = salary;
		}

	public static void setEmpId(int empId) {
		UserDefinedClass.empId = empId;
	}

		public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
		      empId = s.nextInt();
			 name = s.next();
			 phoneNo = s.nextLong();
			 address = s.next();
		      doB = s.next();
			 doj = s.next();
			eMail = s.next();
			 gender = s.next();
			 salary = s.nextFloat();
			
			Set<UserDefinedClass> se =new HashSet();
			
			

	}

}
