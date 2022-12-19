package com.rashmi.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        char[] characters = string.toCharArray();
        Arrays.sort(characters);
        System.out.println("Sorted string: " + new String(characters));
    }
}
