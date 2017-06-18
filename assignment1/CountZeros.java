package assignment1;

import java.util.Scanner;

public class CountZeros {

	int num1;
	
	
	public void set_values()
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		num1 = stdin.nextInt();
		int [] num_array = new int[num1];
		
		for(int i=0;i<num1;i++)
			num_array[i] = stdin.nextInt();
		calculate_zeros(num_array);
		stdin.close();
	}
	
	public void calculate_zeros(int[] num_array)
	{
		num1 = 0;
		int count =0;
		
		for(int i=0;i<num_array.length;i++)
		{
			if(num_array[i] == 0)
			{
				count++;
			}
			else 
				break;
		}
		System.out.println("Count of zeros is : "+ count);
		
	}
	
	public static void main(String args[])
	{
		CountZeros c1 = new CountZeros();
		c1.set_values();
		System.exit(0);
	}
	
}
