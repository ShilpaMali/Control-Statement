package com.control.statements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100; // 100 will be stored into number

		if (number >= 25) { // number >= 25- condition 1
			// 100>=25 - Condition 1 is true
			if (number >= 50) { // number >= 50 condition 2
				// 100>=50 Condition 2 is true
				System.out.println("Number is greater than 50"); // statement 2
			}
		}

	}

}
