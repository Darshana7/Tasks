package com.te.prac;

public class StringPalindrome2 {

	public static void main(String[] args) {
		String str = "Level";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not palindrome");
		
		if (str.equalsIgnoreCase(rev))
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a plaindrome");
	}

}
