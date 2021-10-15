package javaoopsconcepts;

import java.util.HashSet;
import java.util.Set;

public class UserDefinedClassExample {

	public static void main(String[] args) {
		UserDefinedClass us = new UserDefinedClass();
		us.getEmpId();
		us.getName();
		us.getAddress();
		us.getAddress();
		us.getDoB();
		us.getDoj();
		us.geteMail();
		us.getGender();
		us.getSalary();
		
		Set<UserDefinedClass> s= new HashSet();
		s.add(us);
		
		for (UserDefinedClass usd : s) {
			System.out.println("The employee name:"+usd.empId);
			
		}
	  
	 	
	
		

	}

}
