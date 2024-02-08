//package com.practise.examples;
//
//public class LongestCommonPrefix {
//
//	public static void main(String[] args) {
//		String[] strs = { "car", "cir" };
//		if (strs.length == 1) {
//			System.out.println("Only one word to search");
//		} else {
//			String firstWord = strs[0], matchingLetters = "";
//			for (int i = 0; i < firstWord.length(); i++) {
//				int wordsChecked = 0;
//				for (int j = 1; j < strs.length; j++) {
//					if (i < strs[j].length()) {
//						if (firstWord.charAt(i) == strs[j].charAt(i)) {
//							wordsChecked++;
//						} 
//
//					}
//				}
//				if (wordsChecked == strs.length - 1 && i == matchingLetters.length()) {
//					matchingLetters = matchingLetters + firstWord.charAt(i);
//				}
//					
//			}
//			System.out.println(matchingLetters);
//		}
//
//	}
//
//}
