package javamethods;

import java.util.Scanner;

public class Java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ageOfPerson = 216;

String name = ageOfPerson>=18? "Eligible":"Not Eligible";
System.out.println(name);

int number = 20;
int number1 = ++number;
//number++;
System.out.println(number);
System.out.println(number1);
System.out.println(Math.expm1(number));

Scanner input = new Scanner(System.in);
System.out.println("Enter the number");
number = input.nextInt();
System.out.println("The entered number is :"+ number);
	}

}
