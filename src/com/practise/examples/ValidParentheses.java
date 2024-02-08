package com.practise.examples;

public class ValidParentheses {
	public static void main(String args[]) {
		String toBeChecked = "{()}";
		boolean isValid = false;
		char k;
		if (toBeChecked.length() % 2 != 0) {
			System.out.println("Not a valid string");
		} else {
			for (int i = 0; i < toBeChecked.length(); i++) {
				if (toBeChecked.charAt(i) != ' ') {
					k = parenthesesCheck(toBeChecked.charAt(i));
					if (k == 'x') {
						isValid = false;
						System.out.println("Not a valid string");
						break;
					} else {
						for (int y = i; y < toBeChecked.length(); y++) {
							if (k == toBeChecked.charAt(y)) {
								String example = "karthik";
								System.out.println(example.substring(1, 2));
								String temp = toBeChecked;
								toBeChecked = temp.substring(i, y) + temp.substring(y+1, toBeChecked.length()-1);
								toBeChecked.replace(toBeChecked.charAt(y), ' ');
								isValid = true;
								break;
							}
						}
					}
				}
			}
		}
		if (isValid)

		{
			System.out.println("Valid String");
		}
	}

	private static char parenthesesCheck(char charAt) {
		switch (charAt) {
		case '(':

			return ')';
		case '{':
			return '}';
		case '[':
			return ']';

		default:
			return 'x';
		}

	}

}
