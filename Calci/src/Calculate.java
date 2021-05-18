package Calci;

import java.util.Scanner;

public class Calculate {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter integer values\n");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.print("Enter double values\n");
		double num3=sc.nextDouble();
		double num4=sc.nextDouble();
		System.out.print("Power of Integer Values = "+Calculator.powerInt(num1, num2));
		System.out.print("\nPower of Double Values = "+Calculator.powerDouble(num1, num2));
	}
	static class Calculator
	{
		static int powerInt(int num1,int num2)
		{
			return (int) Math.pow(num1, num2);
		}
		static double powerDouble(double num1,double num2)
		{
			return Math.pow(num1, num2);
		}
	}
}