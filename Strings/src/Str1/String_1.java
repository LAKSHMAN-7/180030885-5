package Str1;

import java.io.*;
import java.util.*;
import java.lang.*;
public class String_1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String = ");
		String str=sc.nextLine();
		StringBuffer s=new StringBuffer(str);
		s.reverse();
		String d=s.toString();
		if(str.equals(d))
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not palindrome");
		}
	}

}
