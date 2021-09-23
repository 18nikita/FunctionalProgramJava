package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// UC-3-Euclidean distance
		
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		System.out.println("Enter x =" + x);
		int y=scanner.nextInt();
		System.out.println("Enter y =" + y);
		

		 double distance = Math.sqrt((x * x) + (y * y));
		 System.out.println("Euclidean Distance is " + distance);
	}
}
