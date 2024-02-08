package com.practise.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Practise {

	public static void main(String args[]) {
		System.out.println("Enter marks");
		Scanner scanner = new Scanner(System.in);
		int marks = 0;
		ArrayList<Integer> marksList = new ArrayList<>();
		boolean negativeMarksFound = false;
		do {
			marks = scanner.nextInt();
			if (marks < 0) {
				negativeMarksFound = true;
			} else {
				marksList.add(marks);
			}
		} while (!negativeMarksFound);
		System.out.println(marksList.size());

	}
}
