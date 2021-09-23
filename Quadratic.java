package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// Quadratic root of a^2+bx+c=0 is sqrt(b^2-4ac)/2a
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the valur of a");
		float a=scanner.nextFloat();
		System.out.println("Enter the valur of b");
		float b=scanner.nextFloat();
		System.out.println("Enter the valur of c");
		float c=scanner.nextFloat();
		System.out.println("The roots of the equation are:");
		int delta=(int) (b*b-4*a*c);
		System.out.println(delta);
		float Root1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
		float Root2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Root 1: " + Root1 + "  &  Root 2: " + Root2);
		
		}

}
