package Str10;

import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class String_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
			
		for (int i = 0; i < n; i++) {
			sb.append(str.substring(str.length() - n));
		}

		System.out.println(sb);
	}
}