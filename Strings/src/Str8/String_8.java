package Str8;

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class String_8 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] strs = str.split(".[\\*]+.");
		StringBuffer sb = new StringBuffer();
		for (String x : strs)
			sb.append(x);
		System.out.println(sb);
	}
}