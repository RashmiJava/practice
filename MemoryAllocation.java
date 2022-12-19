package com.rashmi.practice;

public class MemoryAllocation {
	  public static void main(String[] args) 
	  {
	    System.out.println("Memory allocation for primitive data types in Java:");
	    System.out.println("Byte: " + Byte.SIZE/8 + " bytes");
	    System.out.println("Short: " + Short.SIZE/8 + " bytes");
	    System.out.println("Integer: " + Integer.SIZE/8 + " bytes");
	    System.out.println("Long: " + Long.SIZE/8 + " bytes");
	    System.out.println("Float: " + Float.SIZE/8 + " bytes");
	    System.out.println("Double: " + Double.SIZE/8 + " bytes");
	    System.out.println("Character: " + Character.SIZE/8 + " bytes");
	    System.out.println("Boolean: " + (Byte.SIZE/8) + " bytes");
	  }
	}