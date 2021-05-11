package PStats;
import java.util.*;
import java.io.*;
public class PatientStats {

		// TODO Auto-generated method stub
		double w,h;
		 PatientStats(double height,double width)
		{
			h=height;
			w=width;
		}
		double computeBMI()
		{
			double f=w/(h*h);
			return f;
			
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter patient name = ");
			String patientname=sc.nextLine();
			System.out.print("Enter patient Height = ");
			double height=sc.nextDouble();
			System.out.print("Enter patient Width = ");
			double width=sc.nextDouble();
			PatientStats p=new PatientStats(height,width);
			System.out.print("Computed BMI = "+p.computeBMI());
	}

}
