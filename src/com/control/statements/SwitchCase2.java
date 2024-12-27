package com.control.statements;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type = "gold"; // type contain gold
		switch (type) { // gold
		case "silver":
			System.out.println("this is silver");
			break;
		case "gold":
			System.out.println("this is gold");
			break;
		case "platinum":
			System.out.println("this is platinum");
			break;
		default:
			System.out.println("Incorrect input"); // default statement
		}
		//System.out.println("message");

	}

}
