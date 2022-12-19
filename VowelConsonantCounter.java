package com.rashmi.practice;

import java.util.Scanner;

public class VowelConsonantCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.nextLine();
    sc.close();

    int vowels = 0, consonants = 0, digits = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        vowels++;
      } else if (ch >= '0' && ch <= '9') {
        digits++;
      } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
        consonants++;
      }
    }

    System.out.println("Number of vowels: " + vowels);
    System.out.println("Number of consonants: " + consonants);
    System.out.println("Number of digits: " + digits);
  }
}
