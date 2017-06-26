package assignment2;

import java.util.Scanner;

public class StringSize {

	String S1;
	public void get_data()
	{
		Scanner stdin = new Scanner(System.in);
		this.S1= stdin.next();
		stdin.close();
		calculateLength();
	}
	
	public void calculateLength1()
	{
		String S2 ;
		
		int length = S1.length();
		int number = 0;
		while(length/10 >0){
			length = length/10;
			number++;
		}
		
		S2 = S1.substring(0, (S1.length()-number));
		
		System.out.println("The trimmed String is : " + S2);
		
	}
	
	public void calculateLength()
	{
		int length = S1.length();
		
		int number = 0;
		
		double i=0;
		
		String temp;

		double num;
		
		int count=0;
		
		for(int j=length-1;j>=0;j--)
		{
			temp = ""+S1.charAt(j);
			
			num = Double.parseDouble(temp);
			
			number = (int) (number+ (num * Math.pow(10,i)));
			
			i++;
			
			if(length - number > 0)
				count++;
			if(length - number < 0)
				break;
		}
		
		String S2 = S1.substring(0, length-count);
		System.out.println("The trimmed String is:" + S2);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringSize s1 = new StringSize();
		s1.get_data();
		System.exit(0);
	}

}
