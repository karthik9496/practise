//package com.practise.examples;
//
//public class RomanToIntegerTest {
//	int convertRomanToInt(String roman) {
//		int total = 0;
//		for (int i = 0; i < roman.length(); i++) {
//			int s1 = integerValueOf(roman.charAt(i));
//			if (i + 1 < roman.length()) {
//				int s2 = integerValueOf(roman.charAt(i + 1));
//
//				if (s1 <= s2) {
//					total = total - s1;
//				} else {
//					total = total + s1;
//				}
//			} else {
//				total = total + s1;
//			}
//		}
//		return total;
//	}
//
//	private int integerValueOf(char r) {
//		if (r == 'I')
//			return 1;
//		if (r == 'V')
//			return 5;
//		if (r == 'X')
//			return 10;
//		if (r == 'L')
//			return 50;
//		if (r == 'C')
//			return 100;
//		if (r == 'D')
//			return 500;
//		if (r == 'M')
//			return 1000;
//		return -1;
//
//	}
//}
