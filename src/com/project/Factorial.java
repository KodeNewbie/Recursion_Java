package com.project;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		System.out.println(factorial(num));
	}

	private static int factorial(int num) 
	{
		if (num<=1) return 1;
		
		return num * factorial(num-1);
	}

}
