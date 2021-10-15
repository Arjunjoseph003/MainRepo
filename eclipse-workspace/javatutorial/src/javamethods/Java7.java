package javamethods;

import java.util.Scanner;

public class Java7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Buying the pen from the Vending Machine
		/*
		 * int pen = 11; int blackPen = 15; int bluePen = 24; int redPen = 22; String
		 * penModel; int rupees; System.out.println("Enter the PenModel"); Scanner input
		 * = new Scanner(System.in); penModel = input.next();
		 * System.out.println("Enter the amount of the Pen"); rupees = input.nextInt();
		 * switch (rupees) { case 11: System.out.println("Here your pen"); break; case
		 * 15: System.out.println("here your Blackpen"); break; case 24:
		 * System.out.println("Here your Bluepen"); break; case 22:
		 * System.out.println("Here your redpen"); break; default:
		 * System.out.println("you dont have enough money to buy the pen"); }
		 */

		String[] vegetables = { "onion", "carrot", "brinjal" };
		for (int i = vegetables.length - 1; i >= 0; i--) {
			System.out.println(vegetables[i]);
		}

	}

}
