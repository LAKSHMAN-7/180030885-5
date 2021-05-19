package Str5;

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class String_5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		char[] c=new char[n];
		for(int i=0;i<n;i++)
		{
			c[i]=str.charAt(i);
		}
		for(int i=1;i<n-1;i++)
		{
			System.out.print(c[i]);
		}
	}
}