package com.control.statements;

public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 20; //20 will be stored into number

		if (number >= 25) { // number >= 25- condition 1
			// 20>=25 - Condition 1 is false
			if (number >= 50) { // number >= 50 condition 2
				
				System.out.println("Number is greater than 50"); // statement 2
			}
		}

	}

}
