package Inherit1;

public class Employee extends Person {
	private double annualsal;
	private int syear;
	private String nin;
	public  Employee(String n,double a,int y,String i)
	{
		super(n);
		annualsal=a;
		syear=y;
		nin=i;
	}
	public void setSalary(double a)
	{
		annualsal=a;
	}
	public void setYear(int y)
	{
		syear=y;
	}
	public void setInssurance_no(String i)
	{
		nin=i;
	}
	public double getSalary()
	{
		return annualsal;
	}
	public int getYear()
	{
		return syear;
	}
	public String getInsurance_no()
	{
		return nin;
	}
	public String toString()
	{
		return super.toString()+" "+annualsal+" "+syear+" "+nin;
	}

}
