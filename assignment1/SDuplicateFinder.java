package assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SDuplicateFinder {
	
	public SDuplicateFinder() {
		int size;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the size :");
		size = stdin.nextInt();
		int[] num_array = new int[size];
		for(int i=0;i<size;i++)
			num_array [i] = stdin.nextInt();
		stdin.close();
		findDuplicate(num_array);
		}

	public void findDuplicate(int[] num_array)
	{
		int n = num_array.length;
		int k=0,count=0;
		int x;
	    Map<Integer,Integer> dups = new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<n-1;i++)
	    {
	    	x=num_array[i];
	    	count=0;
	    	for(int j=i+1;j<n;j++)
	    	{
	    		if(x == num_array[j])
	    		{
	    			if(dups.containsKey(x))
	    			{
	    				k=dups.get(x);
	    				k++;
	    				dups.replace(x, k);
	    			}
	    			
	    			else
	    			{
	    				count++;
	    				dups.put(x,count);
	    			}
	    				
	    	     }
	    	}
	    }
	    
	    System.out.println("The duplicates are: " + dups.keySet());
	    
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		SDuplicateFinder s1= new SDuplicateFinder();
		System.exit(0);
	}
}
