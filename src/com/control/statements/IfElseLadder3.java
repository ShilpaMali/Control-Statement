package com.control.statements;

public class IfElseLadder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 45; // 65 value will be stored into marks variable
		if (marks >= 80) { // 65 >= 80- condition 1- F
			System.out.println("A Grade"); // statement 1
		} else if (marks >= 70 && marks < 80) { // marks >= 70 && marks < 80- condition 2
			 //65 >= 70-F && 65 < 80-T  -> false
			System.out.println("B Grade"); // statement 2
		} else if (marks >= 60 && marks < 70) { // marks >= 60 && marks < 70- condition 3
			//65 >= 60-T && 65 < 70-T
			System.out.println("C Grade"); // statement 3
		} else if (marks >= 50 && marks < 60) { // marks >= 50 && marks < 60 - condition 4
			System.out.println("D Grade"); // statement 4
		} else {
			System.out.println("Student is fail"); // statement 5
		}

	}

}
