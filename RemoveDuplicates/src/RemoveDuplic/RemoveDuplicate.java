package RemoveDuplic;
import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicate {

		// TODO Auto-generated method stub
		public static int removeDuplicates(int array[], int n){
			if(n==0 || n==1){
			return n;
			}
			int[] temp = new int[n];
			int j = 0;
			for(int i=0; i<n-1; i++){
			if(array[i] != array[i+1]){
			temp[j++] = array[i];
			}
			}
			temp[j++] = array[n-1];
			//Changing the original array
			for(int i=0; i<j; i++){
			array[i] = temp[i];
			}
			return j;
			}
			public static void main (String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int n;
			n=sc.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}
			
			int length = removeDuplicates(array, n);
			//Printing The array elements
			for(int i=0; i<length; i++)
				System.out.print(array[i]+" ");

	}

}
