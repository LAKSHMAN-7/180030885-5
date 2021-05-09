package RevereMatrix;

import java.util.Scanner;

public class ReversetheMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    
	    int x,y,w,z;
	    int arr[][] = new int[2][2];
	    
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
	        {
	            
	        arr[i][j]=sc.nextInt();
	       
	        }
	        
	    }
	    System.out.println("The given array is:");
	    for(int i=0;i<2;i++)
	    {
	        for(int j=0;j<2;j++)
	        {
	        System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	        
	    }
	    System.out.println("The reverse of array is:");
	    for(int i=1;i>=0;i--)
	    {
	        for(int j=1;j>=0;j--)
	        {
	        System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	        
	    }

	    }
	}	
