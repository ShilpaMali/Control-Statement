package com.control.statements;

public class NestedIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 35; //35 will be stored into number

		if (number >= 25) { // number >= 25- condition 1
			// 35>=25 - Condition 1 is true
			if (number >= 50) { // number >= 50 condition 2
				// 35>=50 Condition 2 is false
				System.out.println("Number is greater than 50"); // statement 2
			}
			//System.out.println("hiii");
		}

	}

}
