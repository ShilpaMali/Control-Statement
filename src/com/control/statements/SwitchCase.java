package com.control.statements;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4; //number contain 4
		switch (number) { //4
		case 1:
			System.out.println("this is 1st number..");
			break;
		case 2:
			System.out.println("this is 2nd number...");
			break;
		case 3:
			System.out.println("this is 3rd number...");
			break;
		case 4:
			System.out.println("this is 4th number...");
			break;
		default:
			System.out.println("Incorrect input"); //default statement
		}

	}

}
