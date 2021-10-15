package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	private void empName() {
		// TODO Auto-generated method stub
		System.out.println("Arjun");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E = new Employee();
		E.empName();
		Company c = new Company();
		c.companyName();
		Client cl = new Client();
		cl.clientName();
		Project p = new Project();
		p.projectName();

	}

}
