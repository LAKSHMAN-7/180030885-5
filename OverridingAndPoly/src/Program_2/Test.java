package Program_2;
import java.io.*;
import java.util.Scanner;

import java.util.*;
import java.lang.*;
public class Test {
	public static void main(String args[])
	{
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();
	}
}
public class Shape {
	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	public void erase()
	{
		System.out.println("Erasing Shape");
	}

}
public class Circle extends Shape {
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void erase()
	{
		System.out.println("Erasing Circle");
	}
}
public class Square extends Shape {
	public void draw()
	{
		System.out.println("Drawing Square");
	}
	public void erase()
	{
		System.out.println("Erasing Square");
	}
}
public class Triangle extends Shape {
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}
	public void erase()
	{
		System.out.println("Erasing Triangle");
	}
}