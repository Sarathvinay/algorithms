package assignment1;

import java.util.Scanner;

public class MergeArray {
	
	public MergeArray()
	{
		int size1,size2;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the size of the array 1");
		size1 = stdin.nextInt();
		System.out.println("Enter the size of the array 2");
		size2 = stdin.nextInt();
		int [] num_array2 = new int[size2];
		
		int [] num_array1 = new int[size1+size2];
		for(int i=0;i<size1;i++)
			num_array1[i] = stdin.nextInt();
		
		for(int i=0;i<size2;i++)
			num_array2[i] = stdin.nextInt();
		stdin.close();
		arrayMerge(num_array1, num_array2,size1,size2);
	}
	
	public void arrayMerge(int[] num_array1,int[] num_array2,int size1,int size2)
	{
		int i=0,j=0,k=0;
		while(i<size1 && j<size2)
		{
			if(num_array1[i] < num_array2[j] )
			{
				num_array1[k++] = num_array1[i++];
				System.out.println("Into the if and the value of i is :"+i);
			}
			else
			{
				num_array1[k++] = num_array2[j++];
				System.out.println("Into the else");
			}
		}
		
		System.out.println("i=" +i + "and  j is " + j + " and k is :"+k);
		
		while(j<size2)
		{
			num_array1[k++] = num_array2[j++];
		}
		
		for(i=0;i<num_array1.length;i++)
			System.out.println(num_array1[i]);
		
	}
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeArray m1 = new MergeArray();
		System.exit(0);

	}

}
