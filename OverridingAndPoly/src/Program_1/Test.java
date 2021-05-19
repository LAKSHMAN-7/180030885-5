package Program_1;
import java.io.*;
import java.util.Scanner;

import java.util.*;
import java.lang.*;
public class Test {
	public static void main(String[] args) {
		new Fruit().eat();
		new Apple().eat();
		new Orange().eat();

	}

}
public class Apple extends Fruit {
	@Override
	public void eat() {
		System.out.println("It tastes like apple");
	}
}

public class Fruit {
	protected String name;
	protected String taste;
	protected int size;
	
	public Fruit() {
		name = "Fruit name";
		taste = "Tase of the fruit";
		size = 0;
	}
	
	public void eat () {
		System.out.println(name + " tastes like " + taste);
	}
}

public class Orange extends Fruit {
	@Override
	public void eat() {
		System.out.println("It tastes like Orange");
	}
}