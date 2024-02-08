package com.practise.examples;

import java.util.Scanner;

public class Testing {
	public static void main(String args[]) {
		/*
		 * MethodOverloading methodOverloading = new MethodOverloading(); int result =
		 * methodOverloading.add(5, 4); System.out.println(result); int result1 =
		 * methodOverloading.add(1, 2, 3); System.out.println(result1);
		 */

		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			System.out.println(num);
		}

	}
}