package TwoLargeandTwoSmall;
import java.util.Scanner;
import java.util.Arrays;
public class Twolargeandsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int nums[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		Arrays.sort(nums);
		System.out.println("Minimum = " + nums[0]);
		System.out.println("Minimum = " + nums[1]);
		System.out.println("Maximum = " + nums[nums.length-1]);
		System.out.println("Maximum = " + nums[nums.length-2]);

	}

}
