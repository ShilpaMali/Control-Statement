package com.control.statements;

public class IfElseLadder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 85; // 85 value will be stored into marks variable
		if (marks >= 80) { // 85 >= 80- condition 1- T
			System.out.println("A Grade"); // statement 1
		} else if (marks >= 70 && marks < 80) { // marks >= 70 && marks < 80- condition 2
			System.out.println("B Grade"); // statement 2
		} else if (marks >= 60 && marks < 70) { // marks >= 60 && marks < 70- condition 3
			System.out.println("C Grade"); // statement 3
		} else if (marks >= 50 && marks < 60) { // marks >= 50 && marks < 60 - condition 4
			System.out.println("D Grade"); // statement 4
		} else {
			System.out.println("Student is fail"); // statement 5
		}

	}

}