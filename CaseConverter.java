package com.rashmi.practice;

import java.util.Scanner;

public class CaseConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    StringBuilder output = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (Character.isLowerCase(c)) {
        output.append(Character.toUpperCase(c));
      } else if (Character.isUpperCase(c)) {
        output.append(Character.toLowerCase(c));
      } else {
        output.append(c);
      }
    }

    System.out.println("Converted string: " + output);
  }
}
