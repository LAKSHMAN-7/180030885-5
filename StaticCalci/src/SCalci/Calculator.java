package SCalci;
import java.util.*;
public class Calculator {
	int res;
	double res1;
    Calculator()
	{
    	public int powerInt(int num1,int num2)
        {
    		res = (int) Math.pow(num1, num2);
    		return res;
    	}
        public double powerDouble(double num3,double num4)
        {
    		res1 = Math.pow(num3, num4);
    		return res1;
    	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Calculator c = new Calculator();  
		System.out.print("Enter integer values\n");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.print("Enter double values\n");
		double num3=sc.nextDouble();
		double num4=sc.nextDouble();
		System.out.print("Power of Integer Values = "+c.powerInt(num1, num2));
		System.out.print("\nPower of Double Values = "+c.powerDouble(num3, num4));
	}
}
