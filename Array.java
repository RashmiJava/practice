package com.rashmi.practice;

import java.util.Scanner; 

public class Array {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 

    System.out.print("Enter the size of the array: ");
    int n = scanner.nextInt(); 

    int[] numbers = new int[n]; 

    
    for (int i = 0; i < n; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = scanner.nextInt();
    }

    
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }


    int product = 1;
    for (int number : numbers) {
      product *= number;
    }

    
    double mean = (double) sum / n;

    
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);
    System.out.println("Mean: " + mean);
  }
}
