package com.rashmi.practice;

import java.util.Scanner;

public class StringstartswithAandC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of strings: ");
		int n = sc.nextInt();

		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			strings[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			if (strings[i].startsWith("c") || strings[i].startsWith("a")) {
				System.out.println(strings[i]);
			}
		}
	}
}
