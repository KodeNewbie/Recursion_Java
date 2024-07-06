package com.project;

import java.util.Scanner;

public class SumOfNaturalNumbers 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		System.out.println(sum(num));
	}

	private static int sum(int num) 
	{
		if (num<=0) return 0;
		
		return num + sum(num-1);
	}

}
