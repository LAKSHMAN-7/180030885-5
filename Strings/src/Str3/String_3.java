package Str3;

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class String_3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			String str = sc.nextLine();
			int n = str.length();
			
			String repeater = "";
			
			if (n < 2) repeater = str;
			else repeater = str.substring(0, 2);
			
			String output = "";
			
			for (int i = 0; i < n; i++) {
				output += repeater;
			}
			
			System.out.println(output);
	}
}