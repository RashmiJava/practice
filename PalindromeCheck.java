package com.rashmi.practice;

import java.util.Scanner;

public class PalindromeCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read the input string
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    // Check if the string is a palindrome
    boolean isPalindrome = true;
    for (int i = 0; i < input.length() / 2; i++) {
      if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
        isPalindrome = false;
        break;
      }
    }

    // Print the result
    if (isPalindrome) {
      System.out.println("The string is a palindrome.");
    } else {
      System.out.println("The string is not a palindrome.");
    }
  }
}
