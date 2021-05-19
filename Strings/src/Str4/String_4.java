package Str4;

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class String_4 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		if(n%2==0)
		{
			int a=n/2;
			char[] c=new char[a];
			for(int i=0;i<a;i++)
			{
				c[i]=str.charAt(i);
			}
			for(int i=0;i<a;i++)
			{
				System.out.print(c[i]);
			}
		}
		else
		{
			System.out.println("null");
		}
	}
}