package SumOfArrayonCondition;
import java.util.Scanner;
public class SumofArrwithConstraint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int s1=0,s2=0,a=0,b=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==6)
			{
				a=i;
				
			}
			else if(arr[i]==7)
			{
				b=i;
			}
		}
		for(int i=0;i<n;i++)
		{
			s1+=arr[i];
		}
		for(int i=a;i<=b;i++)
		{
			s2+=arr[i];
		}
		System.out.println(s1-s2);
	}

}
