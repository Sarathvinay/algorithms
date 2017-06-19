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
	
	public void calculateLength()
	{
		String S2 ;
		
		int length = S1.length();
		int number = 0;
		while(length >0){
			length = length/10;
			number++;
		}
		
		S2 = S1.substring(0, (S1.length()-number));
		
		System.out.println("The trimmed String is : " + S2);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringSize s1 = new StringSize();
		s1.get_data();
		System.exit(0);
	}

}
