package Str6;

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class String_6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		int n=a.length();
		int n1=b.length();
		if(n<n1)
		{
			System.out.print(a+""+b+""+a);
		}
		else
		{
			System.out.print(b+""+a+""+b);
		}
	}
}