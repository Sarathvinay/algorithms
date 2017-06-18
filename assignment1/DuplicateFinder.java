package assignment1;

import java.util.Scanner;

public class DuplicateFinder {
	
	public DuplicateFinder()
	{
		int size;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the size");
		size = stdin.nextInt();
		int[] num_array = new int[size];
		for(int i=0; i<size;i++)
		{
			num_array[i] = stdin.nextInt();
		}
		stdin.close();
		findDuplicate(num_array);
	}

	public void findDuplicate(int[] num_array)
	{
		int x,k=0,count=0;
		
		int n = num_array.length;
		
		int[] dups = new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			x=num_array[i];
			count=0;
			for(int j=i+1;j<n;j++)
			{
				if(x == num_array[j])
					count++;
			}
			if(count>0)
				dups[k++] = x;
		}
		
		System.out.println("The duplicates are: ");
		
		for(int i=0;i<dups.length;i++)
		{
			System.out.println(dups[i]);
		}
		
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		DuplicateFinder d1 = new DuplicateFinder();
		System.exit(0);
	}
}
